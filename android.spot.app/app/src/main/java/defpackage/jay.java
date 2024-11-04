package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jay extends jaz {
    public static final jaz a;
    static final jaz b;

    static {
        jaz b2 = new jay(null, new ta(0)).b();
        a = b2;
        jay jayVar = new jay(b2, new ta());
        iqh iqhVar = jaz.e;
        hwx.V(!jayVar.d, "Can't mutate after handing to trace");
        hwx.V(true ^ jayVar.d(iqhVar), "Key already present");
        jayVar.c.put(iqhVar, true);
        b = jayVar.b();
    }

    public jay(jaz jazVar, ta taVar) {
        super(jazVar, taVar);
    }
}
