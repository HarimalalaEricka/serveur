package com.example.serveur.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;

    private LocalDateTime dateCommencement;
    private LocalDateTime dateSignalement;
    private String intervention;
    private String zone;
    private String direction;
    private double surfaceApproximative;
    private String pointRepere;
    private String description; // champ pouvant être chiffré
    private String phoneNumber;

    public Message() {}

    public Message(LocalDateTime dateCommencement, LocalDateTime dateSignalement,
                   String intervention, String zone, String direction,
                   double surfaceApproximative, String pointRepere,
                   String description, String phoneNumber) {
        this.dateCommencement = dateCommencement;
        this.dateSignalement = dateSignalement;
        this.intervention = intervention;
        this.zone = zone;
        this.direction = direction;
        this.surfaceApproximative = surfaceApproximative;
        this.pointRepere = pointRepere;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    // Getters et Setters pour tous les champs
    public Long getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Long idMessage) {
        this.idMessage = idMessage;
    }

    public LocalDateTime getDateCommencement() {
        return dateCommencement;
    }

    public void setDateCommencement(LocalDateTime dateCommencement) {
        this.dateCommencement = dateCommencement;
    }

    public LocalDateTime getDateSignalement() {
        return dateSignalement;
    }

    public void setDateSignalement(LocalDateTime dateSignalement) {
        this.dateSignalement = dateSignalement;
    }

    public String getIntervention() {
        return intervention;
    }

    public void setIntervention(String intervention) {
        this.intervention = intervention;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getSurfaceApproximative() {
        return surfaceApproximative;
    }

    public void setSurfaceApproximative(double surfaceApproximative) {
        this.surfaceApproximative = surfaceApproximative;
    }

    public String getPointRepere() {
        return pointRepere;
    }

    public void setPointRepere(String pointRepere) {
        this.pointRepere = pointRepere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
