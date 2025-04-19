package com.kodilla.homework;

import java.util.*;

public class WeatherAlertService {
    private Map<String, Set<Client>> locationClients = new HashMap<>();

    public void addSubscriber(Client client, String location) {
        locationClients.putIfAbsent(location, new HashSet<>());
        locationClients.get(location).add(client);
    }

    public void removeSubscriberFromLocation(Client client, String location) {
        Set<Client> clients = locationClients.get(location);
        if (clients != null) {
            clients.remove(client);
            if (clients.isEmpty()) {
                locationClients.remove(location);
            }
        }
    }

    public void removeClientFromAllLocations(Client client) {
        for (Set<Client> clients : locationClients.values()) {
            clients.remove(client);
        }
        locationClients.entrySet().removeIf(entry -> entry.getValue().isEmpty());
    }

    public void sendToAll(String message) {
        Set<Client> notified = new HashSet<>();
        for (Set<Client> clients : locationClients.values()) {
            for (Client client : clients) {
                if (notified.add(client)) {
                    client.receive(message);
                }
            }
        }
    }

    public void sendToLocation(String location, String message) {
        Set<Client> clients = locationClients.get(location);
        if (clients != null) {
            for (Client client : clients) {
                client.receive(message);
            }
        }
    }

    public void removeLocation(String location) {
        locationClients.remove(location);
    }
}