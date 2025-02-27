class Top{
	public
		int uId;
	int balance;
	protected
		int otp;
	private
		int cvv;
	public
		Top(int uId, int otp, int cvv, int balance) {
		this.uId = uId;
		this.otp = otp;
		this.cvv = cvv;
		this.balance = balance;
	}
		void getInfo()
		{
			System.out.println("uId" + this.uId);
			System.out.println("Balance" + this.balance);
			System.out.println("otp" + this.otp);
			System.out.println("cvv" + this.cvv);
		}
}

class Bottom extends Top
{

}

class Test{
	public static void main(String[] args) {
		
	}
}