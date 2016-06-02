package com.redhat.demo;

public interface ClaimService {
    
    public ClaimOutput apply(ClaimInput input);
    public ClaimStatus cancel(String claimNo);
 
}
