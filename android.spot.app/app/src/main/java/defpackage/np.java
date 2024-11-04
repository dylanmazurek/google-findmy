package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class np {
    public static final buf a = new bug(20);
    public int b;
    public ln c;
    public ln d;

    private np() {
    }

    public static np a() {
        np npVar = (np) a.a();
        if (npVar == null) {
            return new np();
        }
        return npVar;
    }

    public static void b(np npVar) {
        npVar.b = 0;
        npVar.c = null;
        npVar.d = null;
        a.b(npVar);
    }
}
