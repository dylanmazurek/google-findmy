package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyb {
    public String a;
    public int b;
    private int c;
    private int d;
    private byte e;

    public final dyc a() {
        String str;
        int i;
        if (this.e == 3 && (str = this.a) != null && (i = this.b) != 0) {
            return new dyc(str, this.c, this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if ((this.e & 1) == 0) {
            sb.append(" name");
        }
        if ((this.e & 2) == 0) {
            sb.append(" description");
        }
        if (this.b == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.e = (byte) (this.e | 2);
    }

    public final void c(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }
}
