package Day3;

public class Rucksack {
    public static void main(String[] args) {
        Rucksack rucksack = new Rucksack();
        String[] rawInput = rucksack.rawInput;
        //rucksack.stringSplit(rawInput);
        rucksack.badge(rawInput);

    }

    String rawInput[] = {"BdbzzddChsWrRFbzBrszbhWMLNJHLLLLHZtSLglFNZHLJH","nnfMwqpQTMffHlNNLllHnZSS","cGpcMwfppfqcjcTCBBzWDsDbDrjzWz","LhfjhcdjcGdhFfdGfdjdvwCCZMvvLvWwMLCLSwZC","rDnsbmptPmlbQMCrQWQQBZQW","gltgVPngDPbptPsbPzVgmDldfTdfczThjJJjfMcJdFHjjH","dGlgDflTLLLrRLTLVdQLcQMnbvHbbFzNNvMbnHHn","sZjWJJCSjWqfCqSjSmJSbFvCzBMBBzHncHNvMBHN","twqqwpZwfrlwRwDGDR","zCGGFTQMQrsNRNGZdR","cLLQgPDpgcgmvPRHrwBdvrNZ","glWpmJWQDcJpQnpjSmbhFtMnqFfCVTCFCFFM","zNZWFNZBFrGTdBcZZBdJTrGrmgvppgDHwHmgVHCHCvCPDjzC","qtqqPnLSfLwvjvvgvvqH","MtbLLLQbRfPRfnbnnLMtnsbdBNsrGWNWcNcTBWZrrcrWcJ","sZwstbbDVlHtbhcrhhZLrRpNQN","jqGjjFjWnzWGgqWjJJNphnLMRhLhcrhcrSLN","qCJzFJdvmHvbtpbb","ZSRsvvQvZpsRQGJghClPCwGPChCP","FVdMLDdtDRdDcBtmcVFntwgJJTlnNPwJnlTlwlTPgN","VqttMWFmDbjbzrSWRQ","TsDSBcwshdwSCrgRWZBvgGRG","LPVJLqqJbbzpFqwpbvgGRmZPrmZgCvCCfr","tzJlJzQllFLqtwHhjNSdtthjDhTN","fsDLDDnwvnSdqLSsFSDfsLpbgVttPMpPNjMWVMNfpjgW","jhHmBmlrTBBHRPVtMZbppNPPZB","JmTTrTmjRTJqSQQSFqQw","HPzZFgPFMCHJCcZMcDQGwpLqPLqppwhGvv","BrWRqbqRsTSTqNddrVrthLQVwnpwphnvnDnGvGDn","tSbBfsRbTfqjJqjCqm","pCqrqzmqZzrmCCvCJwJPBRwJBWBmwWBJ","VqbqbjFLFfSHnfctBwDdDFTwtRRTDF","LVcnbjHLSqHnhbSGGppCMMZMphpNrQ","PhTcTPsSPCMvvhhMRPttbNWfNsWFNfWWtpNw","rdQrDbJBVVjrBVdLjHHHWNWwfHtzzNtFpZZptppg","JJVGGdddjDjDJmdjGqqRSbPMTvcRlqnnMlvT","SqGfTrBlSrrrfGGQvCnqZhZmPPhvJh","LdVNwgsjdjHmjWwDsDpwsHWtnCnQQQQNnvCnbJZQbNbtZZ","DjssDHLLVppDssdLspswFLVjzfFMTfSBcTRcrFSBzBTzmGzr","JSJJqlldpJlcdVWMlgMJrcCjrhzHCwTjHrQzwTzZ","bBvsGBGNFDNRFNFBRDPsDDHCChhhrZRQQzhjhCjTzWCr","FvbLFGDDtWDFBnPGFDWGqJMgJpSdVStllttlppVS","clpBdBQBsqGpQbVdqTTWRTSFgLLggffg","NzvwmHvZtZZgbDSCLDmfmm","jPJjthHzNwPvvjwjNzPzztZBlrccpbVGBQhlGBVlrpnpBs","NmFFGlGmzCrNWHvFmFWCFvQPTdDDlbbdgJPtgbbdPDcc","RwfBqLwZqffqnPbdDgVQDdtRbT","hnptqLMMLwqjMMjzSzHmhvNNrvvhhz","hqVrDdPdVDqjsDrjjqsfrrWlctvHJNLfvNcLHNNZRNZHvfZL","CSnWQSGBBSnmBnTmSbQbNZZMJNJMccGNHLZNNvNv","gFnmBmBnTCpwmBbgWVqjPsrsjplVrjlqPr","vgVgJJCphzFjzbwljwww","PWmfDgrPrPWlSWqSWlSZ","rrTHQTGTPHDDHgPrcrcPmDPhdtGvnvNnttJCdJhtGVnpdM","DDDhNgWNLWgDqDgtgtwSngjVSQdf","cvFrcGmBrrrCdSfSJQ","mBHzFFvFzmsBspsFsZqhqbWlWdPDlLHbqZ","TLNpGpRzwGQLLQRTwdvWdWbdbgdBlblb","FJDVzZzHfZHVzcHgnvHnvngvvc","MzDVSmZPPrqhGmCqQqLR","mqHWcBHVcgsbhhnTrrTg","fWftGtfJpwJMSdFDLFSGDGFnnNrbrhTNsZnrhTswZZnnsb","dSftppdSFStLDpQfLjWHQvWBmmqVjCqcVv","frfNzgvzzzJwJqpRcP","VdVSnGnHqhDDTdqhdLWmjMTmjMPjPmTsmsmjmR","BdGLSWtBSWDtVqdSDVGqtSSHFZFZtQbZlZfNgFffrgNrvgrl","jBVSjsJcLcqqjtgcmRFRNFFzFm","CnHnWQQGGWnnCnfvCTmZRZgNtfZtNDZPtNDtzl","mWWGGdmQQWwrHHMBBBhrBVqshBLBSL","cLtFcllvrslGLcLHVzDZQzzpznWzQtQZ","TmShfSSPJRRBBfSgmdfBJhDNVpGzVZpzQgZgbWzpnDGp","BhJPfSqdhqJRdBdPqTJBChvrFlHvvCGCccHsMscvrHvv","zfddZTpZLzLDfLtDCttdTfZPnlcPcnhjPDnlcjMchDPjnP","MQsFvFHJsQvmNvvswljgbPbwlwjnmcch","VFVqvqFQHqVJRVCBLpqTGMzCqtMZ","PZdVgNdQQcdcZQtGhnHtBlvlvWTnbBHWWH","CDJmzqFmMmLfqmzFwqfzfwMRvpRbTWBBWDnlnbnWnTNTnB","zFfffjCqwLJCfrCFjCLCzCMsjSZjQNPhQGVSQQZhsGjGgd","nbHntnqPQwTHwQVC","BzfSZSpcBZpzpPhSBjRTCBWTTRWTTTWR","pvZpzPzNfhddJGmmNnJb","GwTgWlvbgTwMrbwTrlWvwtHBNtNvBhBtdZcShHDtNS","PnndmnCmnJFnsmRdmFnnZDhRRScRQQHDtDNtcDQS","CLffLsmqqpJljVdlpMpWlr","dPCzBLTSLqmqdSCsmrTDVQjZfjfVVZnZhhhLGQ","wwFpgvPJNwgPPwvZGnQhbZQQFfQZbf","WvRwwJpHHgpNMNqdTdCdqrmHBPtm","DbWwjSGFSFfwGfCwDSSPPjLhgrrLWRJRgggJphLzpJLq","lQTnMHdcQBvlHMMZBcHHTrbzpdzgqrpLdqzzVRVRVV","vlvlNlBQvBZTQBnHnQTTBBPwPNCCsfSFmbSFfmGPwFmj","hGGQtbVjhRqlmqqrmDlpmw","gPMZsMgdssCPPsvrgZcTZTPSnnLLnBWDwLmwWwBnmWSnWNWB","TsvgMPdcgCfMdcsZJRQhVfVRVQFFQGtr","NfpFTTpFNbpZMRFrJMMMCv","dWJPngDWBtPVBdPVGHZzCGHZrrvZRSMSzv","WDDDVDPlWnLBVgnsgJmQJNqThNmbjlqbbh","vnznqvfrzzVzrvvnfVqztBtGbMCdGmCcdccJccCLCcpSSgcL","RQsDsljDlhssWshHhlhsHTlLbgJLpmgbbcMSpSSbcSJgjd","WswhhHWlRTsQDwWHTRhsvNVvwqzfVmNBtZNmnzzq","cjcPfLlQtPsZQlfHZJqVSFdVwmSRRqSSddwDvF","MgNbBgzgnwdPRFmSPn","CMGbNNMhCMzzPzBpTNPGBclLcLfsptHQfQlZssLcLf","slsdfpSlllpTVJJGgGDgHMdV","wrBQrbQrhQcpbQrhLwRBrjVVgGGPgZMtZMVhgMPMGHPg","QQwRnrwRbbRcmQmrjRnjpvNsNTNSlTmsTqCSvsNSWz","GWNwppdHdpmzgPFPCRmlCBPB","bSrJhJSsMhrJMDPRCPBlwVCtVSLV","QbsbwqQZvrJhhQrhZZrhchTfnTWGNvWpNnjHGvGjNdGT","NMZGmnMBWmwmNnGwHrHvHzfrvrVVVj","pSbDRLgbpJDPpRZRQjjFqVhhDFjDVqfrzv","sQQscLTZcsTpRsBnmlBcdCMBMtlc","hwWslbGWbRvLZvcscZ","gQnmmrNTmSnTfgwDwVwpJvJPJzLqLJTLLvRcZz","mrmnSrDNNQSmmwdggrrDbHMGhtdtGhGlhtClMGhM","qQdlGcvDQDQvDdmtPmmmlStbjSrm","CpNhzWTCTRznBMvwtTjMrHtSvj","nWzsfZCsBhNpZLgGdQDddvqd","ggjTjJWDVVVRTwQcZWvchshWhs","LmFfLfSmBtCttNLfCFBPFNBvvvhrcQdvsrsdSwdqcwrwSw","CHttltmlPLMHRTgJQDgRDTMb","RPJgCdhgPPSzvWDcCfGHDcvf","HbrrwBspTwWDDnqbZjjD","rQrFsrsstQMQHJdHQm","GVwQVGBZBNQwsjdNcMMlgJNPgj","SWFfSzTCSWFCSpgnJLSjpMdc","FhTbvrzrMrDCVHsVsHGBtHwv","FsqjjVzFVWFqRRWBssdpNSBHwJpHHJJdddSN","lQgmhvbTcgTgfhTQhSCFCGJHSlwNtJdGHG","vgZPbbfMhbTmchhjRFRnsDRPWVqzWz","cvwfjjcJjqhctvSpCgCFVhrFCrpC","mRsQmsMlNNzznWQlRnsMRQlSCpLNbpwSSSrwFLDFLLLgFp","zznlnGlmRmMlPZnGQzMszMRfccTjcBJjtJtJjqTZtfwBTt","PtCwCCVqbjNNqqvGssPmHGsHMfPH","dcddcWFDJJJcLczhWQdcDScZvHZgpGfsvMfSmsggSvvnvM","TTQmTDhdQQzdRwjBVrRwCwBbBr","BnBsFHCrcnBrMBPSmMSCmrcFqnZLddLhdhdGLvqLqgqnLJJp","WfjTlNVDTtjzNWTlVMWNlTwTJphdgpvJLGLdgghZvGLpwddq","zVjbVblVDlNTlbzTzDjllDTzHmHCsmcMHcSBrCBbrHBcBPSC","ddlcGQlCjQNGQmPLslZTlmTtfT","MDzMwSwqpzpDRpWRJwgZhttrZmTPfZmrmtrMZZ","JSqRBpJzwgDDpqDqvpBRdCjbCjQCFCbHvdGPjdHQ","bwzPwGLZMsbJMPPLGLMQzbhhQRvWWtVqVhgCVtWWQDqt","HddrHFnFNpVnVLhnvLRV","NLdrFjHTBrrdjFSpFmNBmSfZMwZMJJfSffbwzwPbczbJ","QTWSzTTLwTfwflSNJRdvGlRGcNgJBl","FnmmqrqbBBgRbHGc","MFZqrCVCqmZCprspFZmnnMsDfzWzDwSfjSwPQPTLhffwBLwj","npfgFRTZRRnDZLdgRfRrrjcWzGpWGGGQrjjWpP","vblVbvSShhVzHWjzzlrPWG","bVwqvCBtShqBhCCtqhNqCJRTTBDFJJLnJgDRWFBnWg","nHDNQvgvnNZHDnsGcjfNTrTfVrfL","SRWFSBRLtSFqjTrVVcsVjTSG","BdBbRttWBdbdWdbppmZlLmgwHvgQvgLZ","PQRZlpDDptQSclBMGVBdhVFGBMpf","nnrsTCWjLJsnsSMShhGJfwffwV","vjzqsjqgSHbbtvHZ","DgFmbdSDZbPgLbDDmFwZwgLSfccGcGvnvvngsGGnsGMNWsWs","HqztHHhHVhHjhRRhJtCVBCfNprMWpcMMJfsvvMsGscpG","tjVtBVTBtHHqCRqtzQwTPSNdSwPTTbPFDdml","sbmBmHZbRRRmwBmsSjHzRjmSCNFLNLLQNQhFgtQLzNztlrff","MpqPPDPVnGqrJpcqqJpMVlgtlLFLChCgChCCQgCtCD","VdcVVJvdrVWHbwHWBSSBRb","tPDVBzzNSNdDSQpMQMTQJMMQMN","LqSWSmbsmfQTTGZMWGCW","cLjLcbrjqmvfqLbfmqLwDBBzSHPzlwzcdBlnnP","SbnHrGHSrrhHJBrrScDfcPDMfpPGcGcpDL","QTpmpmmQWlZsTvVQDMgggFLgFcPf","zsCNlltCslzlTNsNlShwdJCpSqdHrBhpwr","JZmFrmLGjFZdDGrrVTvzmPVvRRVzwzzl","WBnfMDBqMsgDBqpBvzwVlCwRTRRPpvlw","WfghfttggfSnnqbDftfqSBBDQdHhZFFJrrHFjGJdGjFrjQLj","rNLRjrlVlrFRJzlsjrVlRFGCmnMtftgCNDDgDmCfqNgPNM","SpdBpdHbpHWhZqnCdtCGggqCPn","QHHvvWwWhwVVQRscVzGl","QffLtMQGMQfDMMwMTJwqWHvH","nSSFznjFcfjTgVJTJjvT","RrBpcfSNpRBcFshrCtQrDGLPQb","GctcMldStGwPPbcLsQTV","jhnzDgnHnnfPVwHQTTLTds","gBgzDDhzvqdGGvrtdvtm","PPwRWVTvRvPVLwRpMlzmbmsbHWjbbs","dFTFCNfdjzjFjsMF","SgdffSTrnnqCgdqgcNrfSZqVvVLRDPJZQwJBLPQPtLZwJJ","HSzDQftHphTBHFhr","WMmJsMJNLWNPmmsncjMJcjtvwggVvhFFFhjrVwrjrjppvT","WWPsJJCWCtZZZRGC","SfFZQDRLgpLlRgQRRRFWTsbhBhgTjbWBjhshgw","tHVNGjtzzHvMMJJhrWJNrTrPbP","jvVVvGCGtCmjHtdHzQQfDpSSlDRnFfQFmR","ZBBPfVVPPrVmrWZJzNdPznbnbSzznP","gvgpGqFFMgMcGgwLwGpcJNZSTZbdbdzNNSlqbTnn","ssZLgsMLQvcFpVrhCsmtWHjrrW","nFvhRnWWzBRPHQqcqqCqmFbd","SJDJgVprLfDfbJmHmWWHQtJW","wVsgWVSTgLjfSsVjVBRvRNwwGGRhNZhRMZ","wTRrRBCTPTBPlgMqgHCqggHLgg","dmDzpQpBdmWmWzzzDFzjGNMSWLSgLVGGLVNSLgSg","JbFdmQQJpjpptQbdJJmDmdtnZhZRflTlnTrTlrhBwPPc","jwSwssQbwbStlhRgtsVstn","zPzFdFFZccPDgntzVHHgghRz","vVVdfFmZPDMWZZBmGQbwJJGCLwwMwJCS","PLLffLFqqNLwSffbnVzzRf","lsmgTggChrgDtZsZVblMVJMznVnwMBnb","hDZZTmZvhTgstvwNFdqpWQcqvP","mmWwpwqtmmHTqHpprRZQPPZLZWSFRFRB","gzcgscgbfvhRRNZQRRQPvr","JsjhcshCfJgrrpttTCTplH","TvNrvNrJfWWvtJLTHhvZZhQQwVGZZhbV","mFCPmBMPlPsPPBsMFPszbHQJwwHHhbZVQVzjhGHZ","qmlBsdCSmJBmsBBMnMMTDWDNcLrDprSNcWDNrW","HSnHCVqTddFHSVqFqdStSQGQwRzQCzCRzGRRGNPQwz","jhlBpgNvlfZjlfvmpgfgfBrMRRwMMPPLQMZRPMWMMZPQ","hflfpgjfBfDcpchlpvndbHFDdHqSqNVqNVdn","QBfhlVNfHSZHfVCVHSQfZfTCctdvdDTRtjDCtTRsjsvj","brrWWqzFWzwWbswDchhTRtDhjT","gbrFLnpzqrWPgqpLWrhnHGZlSfLfHfQBGVfHHNVG","hcFmVScmQBVhtcvfHLfvHSnbHRLn","lzQqlDqgpWPvJfRnlNJvww","PjCCCPgDgqGzmMtCQstZmBFs","GrnrHrmVVFMFhSSbSfhR","zjTqLtBjjdWdWTLshMZMDbPNRMSSqSPNfD","dTWjdtwWhjWTBzcnrpcwmQpCwcpw","BgtVBsgVVJhgGsSGJbghJqbsjLfZmLjmmtfZndNNZFFZNLdm","MHTlzlwHSvPvzMSPCTMQCNZdjjmnfQjdZfNLjF","HMDTwPDpzrTzpScBghDbVqRBgRBJsR","qjCsTmrrnnCmhcFrCjqmThRlbHGvJGvvvbRbbJRcQJRG","fVBBTfMdSZLNZgPdgglGRdbtbtJRllJWJtWb","TSZZSpNMPBLgpZLVgppBDFhzDmjrnzhjssFqDhzFnn","MDtDMWmMQmdzmMMqvlGfRcjzgpcPPjczPl","sZsHJWNJFJNbWFBhFBnnbVclbVVPglfcRggffGGpjl","srHWLNZZJdSLSdvDMw","BFqsPnsZcgnncggccqsqqpDPtDWPpPNTNSNThrWtSj","dQbfQQJJdwdmFRbJLRJdMrfDWrjpDrrprhDDDDNWWD","QGwdJmCFJZvGsvvncB","GRRNSjrffGTSPrNTffSgcJTwWJZbbZvwvwtVwWVJZv","CMcFsqmBQzMzshsBQBQvLWmJVwZtpJLJwJLvwt","qBzChnQlzMcRSnnRRjHGGg","dPPbPWNdTBbDpHPHpNsgzvFlglvHzvSFzCFF","fntqhGhRMhnnnGGCVMRhCVlSjswFvvjzjSzvQVSgsl","MMqqJJRCnMhZLCRhtPNrpZPDDWTDTrNBmD","VjVGNTNlNchVjNGRWrSWWtZtRrzncR","BTbbbwDmCDLTbDwfHmzZMmRrWtzPrZSZtrrz","qDLLqvwLBsfBbBdQFQTJhqThVTQJ","qBqPBGZflhrWznzZZdsnzv","FmHRcCCsCDwDbjtzdjWbdz","cTRwCCNHFNmwRgmFTNCFTJqqfqPJsPhPBlsrsfGf","JTNhhNrCTcWpJJcpWw","LLdLsfMsdStbtggLbnTpwfWDzpjvnnjzcz","MqSZsgbMbGFbZtgTSZSFSLhhmHlBQlmrmrPHHCPPZPBr","GgjjgpGvpJJtjgvPrJttsLjVwCsQsQNLsfLfMVCl","RddqZqzcZdSWcHdcqQfQLMwVflfNQNMQ","FncWTRcFlHWFmcFTgPJhGvDgpnnhhGtG","ZGPFJsPQCbZCCbgz","nrvrnGWTwwqTBRcpCRRg","DnGWDldNmSLSMdMQ","ScDmPPPmjmjjWgtdSmdmCnNqVQVVrNRTZTQTQDHHZGNH","wbbMhLvMJpRwJQrJGHqQGrQHqr","wzhspwpppswsMFLmtnzjdcmdPRWPtS","fPlLTtBlTjDbWcTMJcncWqss","LdvLrLpCRRQQmvhhVNpwRMWJZcFMZWJwJFFFwZsGcs","prrRVpvvRVNmRvvzHjHPlzPLSffbbPHS","bbCbzsQbBzbBFbFzFfJHfVJPfVPtzZttpm","hwvrjDDwjcDcvdnNvwdnwwDPpNtNMVtPpJpRmVMPfmtVZR","mmqDWjhcqhwvDDdTsSGGCbQGSBBLTGGl","wthtwrBQhhSrqJJVLMRPPtJLPF","vbmbZqfqgsfHmcllmLLJNLJMNFJNNvPGJn","jHlDscllClCCgbZzhWqBzBQzprWCqS","DwpDlwDwllhJwbDFNDwFPhDnQnZZzVVnnBrtNznzSSzZrr","MHPfWRTgWzTQmSTTZt","GdPjHLRMCfcGvwqDGbFq","NGdNpDPdNGLppLpwSNFFFDLwnnZbMnrHlHZQcHbcnHQcPcQM","jBgBsjssgjWJVGhBfhvJVnMlbnZQVrrrlHCcCZrl","sRBgvRffhhtvtBgvjgttWBJTLmFLLwdwzFdqLDDDqFGdLFTd","RBzRGRGBgnrPJrRGGWWbDggZTSTVZVFFSVZZdw","tfmLhjfshNNsqpppfjHdwVdQZbVbQFVVTmSVDV","jvqtwHqCNLNsNhNfjssLCzGJWcBRJRBCBBBrrWnGrG","cGDBdNFdNdDStNtGdGQGscDMvZjjZWMvMLjsjjLZjLsJLv","fbRnRzHVPClfRlbbmfHRlPvZvMLpqjvZJqZMpzMpZjBZ","gfbfBgCHCPVNhNGgTtFDcF","ljjvLZvvllFnlLJLJjLWFQrVssFpsGMFpNMGsr","qbHSqHTcHChqCmTSRqqBVpVdBQsVQQGHdMprWV","DbtcCqRhhTRmDnPMlLgfgztlZZ","QtMQzPZcbtGgTtLvtf","HwcDsdVVDnNSGLhwvffJvfTT","CSsdSHNmSDHcCqqcrrzQcC","nDNDfmMnmDJRNfJJdMDRBdwjcTtsSHvBTswTjwLtsCts","QcbQrZZggGWVVWbZZjStswCSCCttGCwLvC","ZgZgbzVglVbchVVrVhFWWpnnpNJmJMqDfMJnMRqNDDMD","WMfNvsjWGjsqFjqTRRQVJztDzVmJHbft","ZPhplcrLrmzQGzmz","ZPddLPlcSclhZChndMvgTjjWNGWMGWBj","nDLjMchghDcljfjffpfsqTmGCTGszGZVVzHV","wdFJPFrQRwSNbjVQCTGsHZHmHCHs","BRJJSddvdBrJwrBRNRFRSPRjvclLpWhpglgWpLplltnMgh","BbVRzMcpbMNMHMTJmWdljdlJjT","GtsqFnfvGSFqGfQvgnWWZlLlLjZWtWldPmlT","sSsFqsqsGghwQQmfGRHbbVczbwwBpBpHcw","BBFCBJCsGJBBgvgsvTlVhgNg","ZnLdjRQddLRnZrlScHRVTTSHhRvg","fnnjZLWdrnqdWrrPLddqVqBzGDJJFGCBDfJmbDzFMbmB"};
    int priority = 0;

    public void stringSplit(String[] rawInput) {
        for (int i = 0; i < rawInput.length; i++) {
            boolean isGevonden = false;
            int aantalChars = rawInput[i].length();
            for (int j = 0; j < ((rawInput[i].length() / 2)) && !isGevonden; j++) {
                for (int k = rawInput[i].length() / 2; k < rawInput[i].length(); k++) {
                    if (rawInput[i].charAt(j) == rawInput[i].charAt(k)) {
                        char matchChar = rawInput[i].charAt(k);
                        int matchInt = matchChar;
                        if (matchChar >= 97) {
                            priority = priority + (matchInt - 96);
                        }
                        if (matchChar <= 90) {
                            priority = priority + (matchInt - 38);
                        }
                        isGevonden = true;
                        break;
                    }

                }
            }
        }
        System.out.println("Totaal priority: " + priority);
    }

    public void badge(String[] rawInput) {
        for (int i = 0; i < rawInput.length; i = i + 3) {
            for (int j = 0; j < rawInput[i].length(); j++) {
                if ((rawInput[i + 1].indexOf(rawInput[i].charAt(j)) !=-1) &&
                        (rawInput[i + 2].indexOf(rawInput[i].charAt(j)) !=-1)) {
                    System.out.println(rawInput[i].charAt(j));
                    char matchChar = rawInput[i].charAt(j);
                    int matchInt = matchChar;
                    if (matchChar >= 97) {
                        priority = priority + (matchInt - 96);
                        break;
                    }
                    if (matchChar <= 90) {
                        priority = priority + (matchInt - 38);
                    }
                    break;
                }
            }

        }
        System.out.println("Totaal priority: " + priority);
    }

}




/*
Stappenplan:
-tel de characters per string (int aantalChars)
-aantalChars delen door 2 = int stringSplit
-String[][] compartments : helft in de ene cel, helft in de andere
-vergelijk de twee cellen per rij
-welk character hebben ze gemeen? upper- en lowercase maakt uit.
(tussenstap: print het character dat ze gemeen hebben)
-puntentelling volgens opgave
 */

/*Stappenplan:
-x=0.
-kijk naar rugzak x+1 en x+2.
-welke letters komen in allebei voor? Maak een lijstje.
    -kijk naar het eerste karakter van de rugzak. Zit die ergens in de tweede rugzak?
    -kijk naar het x+1e karakter van de rugzak. Zit die in de tweede rugzak?

-maar 1 letter op het lijstje? Klaar.
-meerdere letters: kijk naar rugzak x+3.
-welke letter komt zowel voor op het lijstje als in rugzak x+3?
-bewerk deze uitkomst elders verder. Klaar.
Na klaar: x=x+3. begin opnieuw.
 */
