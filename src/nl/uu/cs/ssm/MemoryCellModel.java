/**
 * Simple Stack Machine
 *
 * Written by Atze Dijkstra, atze@cs.uu.nl,
 * Copyright Utrecht University.
 *
 */

package nl.uu.cs.ssm ;

interface MemoryCellModel
{
    public void addMemoryCellListener( MemoryCellListener l ) ;
    
    public void removeMemoryCellListener( MemoryCellListener l ) ;
    
}