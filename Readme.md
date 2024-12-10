Simple GroupChat Application 

#OVERVIEW

This Simple GroupChat Application allows multiple clients to connect to a server and communicate with
each other in real-time using socket programming in Java. The application demonstrates core features
of socket communication, inheritance, and polymorphism.

#Core Features

Real-time Messaging: Clients can send and receive messages instantly.
Multiple Clients: The server can handle multiple clients simultaneously.
Broadcasting Messages: Messages sent by one client are broadcasted to all other connected clients.
Client Identification: Each client can identify itself by sending a name to the server upon connection.

#Class Purposes

ChatClient (Interface):

Defines the contract for chat clients with methods for sending and receiving messages.

ChatClientImpl (Class):

Implements the ChatClient interface.
Manages socket connection, input/output streams, and handles user input for sending messages.
Starts a thread to listen for incoming messages from the server.

ChatServer (Class):

Listens for incoming client connections on a specified port.
Manages connected clients and broadcasts messages to all clients except the sender.

ClientHandler (Class):

Extends Thread to handle individual client connections.
Reads messages from the client and broadcasts them to other clients.
Manages the lifecycle of the client connection.

Client2 and Client3 (Classes):

Similar to ChatClientImpl, these classes represent additional clients that can connect to the server.
They demonstrate the ability to create multiple client instances with different names.

Inheritance and Polymorphism

#Inheritance:

ClientHandler extends Thread, allowing it to run in its own thread for handling client connections concurrently.

#Polymorphism:

The ChatClient interface allows different client implementations (ChatClientImpl, Client2, Client3) to be treated as
ChatClient types. This enables the server to handle any client that implements the ChatClient interface without needing
to know the specific class type.

#Instructions to Run the Application

Compile the Code: Ensure you have Java Development Kit (JDK) installed. Compile all Java files in the mypack package.

Start the Server: Run the ChatServer class to start the server.



Start Clients: Open multiple terminal windows (or command prompts) to run different clients. You can run Client2 and Client3 to
simulate multiple users.


Interact: Once the clients are running, they can send messages to each other. Each client will display messages received from
the server.



Group Members:
	Tapia, Aeron Jay A.
	Lagatic, Christopher P.
	Lazaro, Christine R.

Submitted to:
	Jomarie Isorena