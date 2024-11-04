package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nnz implements Serializable {
    public static final nnz a = new nny("eras", (byte) 1);
    public static final nnz b = new nny("centuries", (byte) 2);
    public static final nnz c = new nny("weekyears", (byte) 3);
    public static final nnz d = new nny("years", (byte) 4);
    public static final nnz e = new nny("months", (byte) 5);
    public static final nnz f = new nny("weeks", (byte) 6);
    public static final nnz g = new nny("days", (byte) 7);
    public static final nnz h = new nny("halfdays", (byte) 8);
    public static final nnz i = new nny("hours", (byte) 9);
    public static final nnz j = new nny("minutes", (byte) 10);
    public static final nnz k = new nny("seconds", (byte) 11);
    public static final nnz l = new nny("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    /* JADX INFO: Access modifiers changed from: protected */
    public nnz(String str) {
        this.m = str;
    }

    public abstract nnx a(nno nnoVar);

    public final String toString() {
        return this.m;
    }
}
