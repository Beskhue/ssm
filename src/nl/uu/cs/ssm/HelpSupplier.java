/**
 * Simple Stack Machine
 *
 * Written by Atze Dijkstra, atze@cs.uu.nl,
 * Copyright Utrecht University.
 *
 */

package nl.uu.cs.ssm ;

import java.util.Enumeration;

public interface HelpSupplier
{
    public Enumeration<String> getTopics() ;
    
    public String getHelpSupplierName() ;
    
    public String getShortSummaryForTopic( String topic ) ;
    
    public void getHelpForTopic( String topic, HelpAccumulator acc ) ;
    
}
