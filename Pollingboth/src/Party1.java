
public class Party1 {
	
	private static int count;
	private  String name;
	private int member;
	private String leader;
	private int votecount;
	
	Party1(String s,String l,int mem)
	{
		name=s;
		leader=l;
		member=mem;
	}
	
	public Party1 getObject()
	{
		return this;
	}
	
	public int getVotecount()
	{
		return votecount;
	}
	public  int getCount()
	{
		return count;
	}
	public  String getName()
	{
		return name;
	}
	public int getMember()
	{
		return member;
	}
	public String getLeader()
	{
		return leader;
	}

	public void setcount()
	{
		count++;
	}
}
