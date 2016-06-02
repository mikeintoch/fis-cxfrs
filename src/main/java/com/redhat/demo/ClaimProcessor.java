package com.redhat.demo;

public class ClaimProcessor {
	public ClaimOutput process(ClaimInput input) throws Exception {
		// get the id of the input
		// ClaimInput input = exchange.getIn().getBody(ClaimInput.class);

		System.out.println(input);

		// set reply including the id
		ClaimOutput output = new ClaimOutput();
		output.setClaimNo("A00099484");
		output.setCustomerName(input.getCustomerName());
		output.setStatus("DONE");
		// exchange.getOut().setBody(output);
		return output;
	}

	public ClaimStatus cancel(String claimNo) throws Exception {

		ClaimStatus status = new ClaimStatus();
		status.setClaimNo(claimNo);
		status.setStatus("OK");

		return status;
	}
}
