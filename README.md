# Bankers-Algorithm-using-Java

Deadlock
When processes request a resource and if the resources are not available at that time the process enters into waiting state. Waiting process may not change its state because the resources they are requested are held by other process. The situation is called deadlock.

Implementation of Bankers Algorithm using Java

Banker’s Algorithm is a resource allocation and deadlock avoidance Algorithms.

The Banker algorithm, sometimes referred to as the detection algorithm, is a resource allocation and deadlock avoidance algorithm developed by Edsger Dijkstra that tests for safety by simulating the allocation of predetermined maximum possible amounts of all resources, and then makes an "s-state" check to test for possible deadlock conditions for all other pending activities, before deciding whether allocation should be allowed to continue.

The banker's algorithm relies on several key data structures: ( where n is the number of processes and m is the number of resource categories.)

Available[m] indicates how many resources are currently available of each type.
Max[n][m] indicates the maximum demand of each process of each resource.
Allocation[n][m] indicates the number of each resource category allocated to each process.

Safe State
A state is safe if the system can allocate all resources requested by all processes ( up to their stated maximums ) without entering a deadlock state.


# Procedure:

Input: We need input for no. of resources and procedures from user. Then, we need three matrices from user for allocation matrix, max matrix and available matrix.
Allocation Matrix: instances allocated to process
Max Matrix: Maximum instances required by process
Available Matrix: Matrix available for resources
Process: First, we will create a need matrix, this matrix will show us instances of resources needed more by process.
Need Matrix = Max Matrix – Allocation Matrix

Then, for every process we need to compare every instance of need matrix with every consecutive instance of available matrix. If every pair of need matrix instance is less or equal to instance of available matrix, then only we will allocate resource to that process. And hence, the process will be done.

Condition for safety algorithm
Need Matrix <= Available Matrix

At last if all instances of need matrix are less than equal to available matrix, then only process will run.
Then as the process ends, new available resources will be assigned.

Available Matrix = Allocation Matrix + Available Matrix

Output : Safe Sequence of Process allocated
