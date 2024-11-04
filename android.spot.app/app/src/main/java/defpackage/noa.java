package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noa extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    public String a;

    public noa(nns nnsVar, Number number, Number number2, Number number3) {
        super(a(nnsVar.y, number, number2, number3, null));
        this.a = super.getMessage();
    }

    private static String a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public noa(nns nnsVar, Number number, String str) {
        super(a(nnsVar.y, number, null, null, str));
        this.a = super.getMessage();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public noa(defpackage.nns r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.y
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Value \""
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "\" for "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " is not supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.String r3 = super.getMessage()
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noa.<init>(nns, java.lang.String):void");
    }
}
