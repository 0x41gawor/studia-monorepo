# 5G protocols

## SCTP

Stream Control Transfer Protocol 

https://en.wikipedia.org/wiki/Stream_Control_Transmission_Protocol

Mobile Network ultimate goal is to transfer stream of packets between UE and Data Network.

So the protocol for messages between RAN and Core network is SCTP. It is in transport layer in terms of TCP/IP (Internet protocol suite). Originated from SS7 (Singnalling System 7). Protocol provides the message oriented feature of UDP, while ensuring reliable, in-sequence transport of messages with congestion control like TCP.

**Packet structure**

An SCTP packet consists of two basic sections:

1. The *common header*, which occupies the first 12 bytes 
2. The *data chunks*, which occupy the remaining portion of the packet.

![image-20220601133121114](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\image-20220601133121114.png)

## Non-Access Stratum

Non-Access Stratum is a functional layer in the wireless telecom protocol stack between the UE and CORE.

The layer is used to manage the establishment of communication sessions and maintaining them as UE moves.

The NAS is defined in contrast to Access Stratum, which is responsible carrying the information over the wireless part of the mobile network.

Further description of NAS is that it is a protocol for messages passed between UE and Core network (AMF) transparently through the Radio Access Network.

The distinction between NAS and AS is that UE uses:

- NAS for communication with Core Network
- AS for communication with RAN 

Note that AS needs to carry NAS messages sometime.

![image-20220601134117271](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\image-20220601134117271.png)

The example protocol stack for control plane in 5G.

>Stratum  - in geology a stratum is a layer of rocks or sediment characterized by certain properties and attributes that distinguish it from adjacent layers from which it is separated by visible surfaces.

## NGAP

Protocol used between the gNodeB and core in order to support both UE and non UE associated services. Simplifying it is the Core network control protocol  over the gNodeB (not UE). NGAP is also used to carry NAS messages as payload between gNodeB and Core network (AMF).

The protocol that works one layer below NGAP is SCTP. So the NGAP messages are carried in SCTP packets as payload.

## GTP

GTP - GPRS Tunneling Protocol is a protocol used to carry user data traffic. It originated from GPRS and was used in GMS, UMTS and LTE previously.

