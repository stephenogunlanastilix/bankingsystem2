package bankingsystem;




public class Getinfo {//Creating the public class get info

    



    private int id;//declaring id field of type integer with private access modifier

	private String firstname;//declaring firstname field of type String with private access modifier

	private String lastname;//declaring lastname field of type String with private access modifier

    private String username;//declaring username field of type String with private access modifier

    private String password;//declaring password field of type String with private access modifier

    private String memberid;//declaring memberid field of type String with private access modifier

    private int acctbalance;//declaring acctbalance field of type integer with private access modifier

    //	This is a 7 argument constructor that helps in the inialization of objects

    public Getinfo(int id ,String firstname, String lastname, String username, String password , String memberid , int acctbalance) {

		super();

		this.firstname = firstname;;//using the keyword this to refer firstname

		this.lastname = lastname;//using the keyword this to refer lastname

		this.username = username;//using the keyword this to refer username

		this.password = password;//using the keyword this to refer password

		this.memberid = memberid;//using the keyword this to refer member

		this.acctbalance = acctbalance;//using the keyword this to refer acctbalance

	}

    //Accessors and Mutators

    public Getinfo() {//Non argument constructor

		// TODO Auto-generated constructor stub

	}

	/**

	 * @return the id

	 */

	public int getacctbalance() {//getting and returning account balance

		return acctbalance;

	}

	/**

	 * @param acctbalance 

	 * @param id the id to set

	 */

	public void setacctbalance(int acctbalance) {//Sets user acctbalance

		this.acctbalance = acctbalance;

	}

	/**

	 * @return the id

	 */

	public String getmemberid() {///getting and returning member id

		return memberid;

	}

	/**

	 * @param id the id to set

	 */

	public void setmemberid(String memberid) {//Sets user memberid

		this.memberid = memberid;

	}

	/**

	 * @return the id

	 */

	public int getid() {//getting and returning id

		return id;

	}

	/**

	 * @param id the id to set

	 */

	public void setid(int id) {//Sets user id

		this.id = id;

	}

    /**

	 * @return the firstname

	 */

	public String getFirstname() {//getting and returning first name

		return firstname;

	}

	/**

	 * @param firstname the firstname to set

	 */

	public void setFirstname(String firstname) {//Sets user firstname

		this.firstname = firstname;

	}

	/**

	 * @return the lastname

	 */

	public String getLastname() {//getting and returning Lastname

		return lastname;

	}

	/**

	 * @param lastname the lastname to set

	 */

	public void setLastname(String lastname) {//Sets user lastname

		this.lastname = lastname;

	}

	/**

	 * @return the username

	 */

	public String getUsername() {//getting and returning username

		return username;

	}

	/**

	 * @param username the username to set

	 */

	public void setUsername(String username) {//Sets user Username

		this.username = username;

	}

	/**

	 * @return the password

	 */

	public String getPassword() {

		return password;//getting and returning password

	}

	/**

	 * @param password the password to set

	 */

	public void setPassword(String password) {//Sets user password

		this.password = password;

	}



}

//Ends Getinfo