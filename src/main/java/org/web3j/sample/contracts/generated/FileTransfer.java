package org.web3j.sample.contracts.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class FileTransfer extends Contract {
    private static final String BINARY = "606060405260405160808061030683398101604090815281516020830151918301516060909301519092905b60008054600160a060020a03808716600160a060020a03199283161790925560018054928616929091169190911790556002829055600380546001608060020a0383166001608060020a03199091161790555b505050505b610274806100926000396000f3006060604052361561005c5763ffffffff60e060020a600035041663089587cd81146100615780632526d9601461008a57806359dc735c1461009957806360aa825a146100c25780638493f71f146100e1578063db006a7514610100575b610000565b346100005761006e610124565b60408051600160a060020a039092168252519081900360200190f35b3461000057610097610134565b005b346100005761006e610180565b60408051600160a060020a039092168252519081900360200190f35b34610000576100cf610190565b60408051918252519081900360200190f35b34610000576100cf6101a9565b60408051918252519081900360200190f35b34610000576101106004356101b0565b604080519115158252519081900360200190f35b600154600160a060020a03165b90565b60005433600160a060020a0390811691161461014f57610000565b6003546fffffffffffffffffffffffffffffffff1643111561017057610000565b600054600160a060020a0316ff5b565b600054600160a060020a03165b90565b6003546fffffffffffffffffffffffffffffffff165b90565b6002545b90565b60008054819033600160a060020a039081169116146101ce57610000565b60648311156101dc57610000565b82606414156101f357600154600160a060020a0316ff5b506001546040516064600160a060020a033081163191909104850292169082156108fc029083906000818181858888f19350505050151561017057610000565b600054600160a060020a0316ff5b5b509190505600a165627a7a723058208104d48bb71f6aea9568cf12a89571b9d060bc4b8850c656905fedb3ee3111640029";

    protected FileTransfer(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected FileTransfer(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getServer() {
        Function function = new Function("getServer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> clawback() {
        Function function = new Function(
                "clawback", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getClient() {
        Function function = new Function("getClient", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getExpirationBlock() {
        Function function = new Function("getExpirationBlock", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getFileHash() {
        Function function = new Function("getFileHash", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> redeem(BigInteger percent) {
        Function function = new Function(
                "redeem", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(percent)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<FileTransfer> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String _client, String _server, BigInteger _fileHash, BigInteger _expirationBlock) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_client), 
                new org.web3j.abi.datatypes.Address(_server), 
                new org.web3j.abi.datatypes.generated.Uint256(_fileHash), 
                new org.web3j.abi.datatypes.generated.Uint128(_expirationBlock)));
        return deployRemoteCall(FileTransfer.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static RemoteCall<FileTransfer> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String _client, String _server, BigInteger _fileHash, BigInteger _expirationBlock) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_client), 
                new org.web3j.abi.datatypes.Address(_server), 
                new org.web3j.abi.datatypes.generated.Uint256(_fileHash), 
                new org.web3j.abi.datatypes.generated.Uint128(_expirationBlock)));
        return deployRemoteCall(FileTransfer.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static FileTransfer load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new FileTransfer(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static FileTransfer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new FileTransfer(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
