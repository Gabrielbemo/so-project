package com.soproject.domain.serviceorder.entities;

// This class can be converted to a kind client class
// Because has a public driver that can do two actions
// public driver in
//   left the car
//   tell about the car
// public driver out
//   validates the fix
//   took the car
// public controller
//   give authorization to maintenance
//   validate that service done
// public work secretary
//   authorize the service payment
// public financial secretary
//   make the service payment
public class RequestingResponsibleEntity {
    private String requestingDriver;
    private String requestingMaintenance;
}
