_Only pacs.106.001.02 due to unpublished yet of Standard Release 2024_


### Sample
```kotlin

    val vensysCamt10600101 = VensysCamt10600101()
    // Equals tag20
    val perTransaction31 = ChargesPerTransaction31();
    perTransaction31.chrgsId = "REFERENCE-ID"
    val underlyingText = TransactionReferences71();
    underlyingText.msgId = "RELATED-REFERENCE"
    perTransaction31.rcrd = ChargesPerTransactionRecord31()
    perTransaction31.rcrd.undrlygTx = underlyingText
    val chargesPaymentRequestV02 = ChargesPaymentRequestV02()
    val chargesRecord5 = Charges3Choice1()
    chargesPaymentRequestV02.chrgs = chargesRecord5
    chargesRecord5.perTx = perTransaction31

    vensysCamt10600101.chrgsPmtReq = chargesPaymentRequestV02
    // for total charges
    // CBPR Amount
    val cbprAmount = CBPRAmount()
    cbprAmount.value = BigDecimal("20")
    cbprAmount.ccy = "USD"
    perTransaction31.rcrd.ttlChrgsPerRcrd = TotalCharges81() // inisiasi
    perTransaction31.rcrd.ttlChrgsPerRcrd.ttlChrgsAmt = cbprAmount


    // for charges breakdown
    val chargesBreakdown11 = ChargesBreakdown11();
    chargesBreakdown11.cdtDbtInd = CreditDebitCode1.DBIT
    chargesBreakdown11.amt  = cbprAmount
    chargesBreakdown11.tp = ChargeType3Choice1()
    chargesBreakdown11.tp.cd = "CHGS"
    perTransaction31.rcrd.chrgsBrkdwn.add(chargesBreakdown11)
    println(vensysCamt10600101.buatKeString())
```