
public class State {
	
	private int numberofpollingbooth;
	private int numberofparty;
	private String name;
	private int numberofofficers;
	private int averagevote;
	//private int votecount=0;
	
	
	public State(String nam,int nopb,int nop,int nof,int av) {
		name=nam;
		numberofpollingbooth=nopb;
		numberofparty=nop;
		numberofofficers=nof;
		averagevote=av;
		
	}
	
	/*public int getVotecount()
	{
		return votecount;
	}*/
	public String getName()
	{
		return name;
	}	
	public int getNumberOfParty()
	{
		return numberofparty;
	}
	public int getNumberOfPollingBooth() {
		
		return numberofpollingbooth;
	}
	public int getNumberOfOfficer() {
		
		return numberofofficers;
	}
	public int getAverageVote() {

		return averagevote;
	}
	public String display() {
		return "Name of State:- "+name+" Number of Party:- " +numberofparty+" Number of officers:- "+numberofofficers+" Number of Pollingbooth :- "+numberofpollingbooth+" Average vote:- "+averagevote;
	}
}