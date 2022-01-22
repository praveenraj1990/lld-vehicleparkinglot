# Parking Lot
SOLID:
S-divide classes
O-
L-
I-
D-

Design Pattern:
Factory ->GateFactory
ParkingSpotFactory
PriceFactory
Template ->EntryGate
Singleton -> ParkingLot

Interfaces:
AdminService
GateKeeperService
ParkingFloorService
ParkingSpotService
PriceCompute
TicketService
UserService


Requirement:
1. Parking lot has multiple floors, multiple entry and exit points.
2. Entry is recorded at entry point and payment is done at the time of exit.
3. Parking lot contains Multiple floors.
4. Parking floor containts multiple parking slots which are of different types.
    1. HANDICAPPED
    2. CAR
    3. LARGE
    4. MOTORBIKE
    5. ELECTRIC
    6. EBIKE

5. Parking is on first come first served basis.
6. Time is recorded at the time of issuing the ticket in entry panel.
7. Time is recorded at the exit panel and charges are calculated at that point of time.
8. User should be able to pay for the ticket.
9. Admin should be able to add floor to the lot.
10. Admin should be able to add parking slots to the floor.
11. Admin should be able to remove a slot.
12. Admin should be able to add entrance and exit panels.
13. User should not be issued a ticket if the slot is not available.
14. As the user is allocated a slot the inventory of the slots gets reduced.
15. As user leaves the parking the inventory get updated.
16. user can pay payment at portal
17. Parked vehicle count would be visible in displayboard at entry and exit panel
18. Attendant can add/modify parking rate
19. User can get notification by sms or email
20. Car can fit into multiple spot type


TestCases:



