package com.kodilla.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.*;

public class WeatherAlertServiceTest {

    private WeatherAlertService service;
    private Client client1;
    private Client client2;

    @BeforeEach
    public void setUp() {
        service = new WeatherAlertService();
        client1 = mock(Client.class);
        client2 = mock(Client.class);
    }

    @Test
    public void testAddSubscriberAndSendToLocation() {
        service.addSubscriber(client1, "Kraków");
        service.sendToLocation("Kraków", "Burza!");

        verify(client1, times(1)).receive("Burza!");
    }

    @Test
    public void testPreventDuplicateSubscriptions() {
        service.addSubscriber(client1, "Warszawa");
        service.addSubscriber(client1, "Warszawa"); // drugi raz

        service.sendToLocation("Warszawa", "Grad!");

        verify(client1, times(1)).receive("Grad!");
    }

    @Test
    public void testRemoveSubscriberFromLocation() {
        service.addSubscriber(client1, "Gdańsk");
        service.removeSubscriberFromLocation(client1, "Gdańsk");

        service.sendToLocation("Gdańsk", "Silny wiatr!");

        verify(client1, never()).receive(anyString());
    }

    @Test
    public void testRemoveClientFromAllLocations() {
        service.addSubscriber(client1, "Wrocław");
        service.addSubscriber(client1, "Poznań");

        service.removeClientFromAllLocations(client1);

        service.sendToLocation("Wrocław", "Alert!");
        service.sendToLocation("Poznań", "Alert!");

        verify(client1, never()).receive(anyString());
    }

    @Test
    public void testSendToAllSendsOnceToEachClient() {
        service.addSubscriber(client1, "Lublin");
        service.addSubscriber(client1, "Łódź"); // ta sama osoba

        service.addSubscriber(client2, "Lublin");

        service.sendToAll("Zmiana regulaminu");

        verify(client1, times(1)).receive("Zmiana regulaminu");
        verify(client2, times(1)).receive("Zmiana regulaminu");
    }

    @Test
    public void testSendToLocationOnlyReachesSubscribedClients() {
        service.addSubscriber(client1, "Zakopane");
        service.addSubscriber(client2, "Sopot");

        service.sendToLocation("Zakopane", "Lawina!");

        verify(client1, times(1)).receive("Lawina!");
        verify(client2, never()).receive(anyString());
    }

    @Test
    public void testRemoveLocation() {
        service.addSubscriber(client1, "Rzeszów");
        service.removeLocation("Rzeszów");

        service.sendToLocation("Rzeszów", "Ulewne deszcze");

        verify(client1, never()).receive(anyString());
    }
}