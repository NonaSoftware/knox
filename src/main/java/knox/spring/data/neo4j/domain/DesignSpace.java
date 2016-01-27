package knox.spring.data.neo4j.domain;

import org.neo4j.ogm.annotation.*;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class DesignSpace {
	
    @GraphId
    Long id;
    
    String spaceID;
    
    int idIndex;
    
    @Relationship(type = "CONTAINS") 
    Set<SpaceToNode> spaceToNode;
    
    @Relationship(type = "CONTAINS") 
    Set<SpaceToBranch> spaceToBranch;
    
    @Relationship(type = "SELECTS") 
    HeadBranch headBranch;

    public DesignSpace() {
    	
    }
    
    public String getSpaceID() {
    	return spaceID;
    }
    
    public int getIDIndex() {
    	return idIndex;
    }
    
    public Set<SpaceToNode> getSpaceToNode() {
    	return spaceToNode;
    }
    
    public Set<SpaceToBranch> getSpaceToBranch() {
    	return spaceToBranch;
    }
    
    public HeadBranch getHeadBranch() {
    	return headBranch;
    }

}
