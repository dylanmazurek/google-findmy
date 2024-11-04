package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhw {
    public final ngi a;
    public final int b;
    public final String c;

    public nhw(ngi ngiVar, int i, String str) {
        ngiVar.getClass();
        str.getClass();
        this.a = ngiVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == ngi.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
