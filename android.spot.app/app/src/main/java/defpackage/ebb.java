package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebb {
    public String a;
    public String b;
    private boolean c;
    private boolean d;
    private byte e;

    public final ebc a() {
        if (this.e != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" executePendingTransactions");
            }
            if ((this.e & 2) == 0) {
                sb.append(" applyCustomAnimations");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ebc(this.a, this.b, this.c, this.d);
    }

    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }

    public final void c(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 1);
    }
}
