package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtu implements buf {
    private final dtt a;
    private final dtw b;
    private final buf c;

    public dtu(buf bufVar, dtt dttVar, dtw dtwVar) {
        this.c = bufVar;
        this.a = dttVar;
        this.b = dtwVar;
    }

    @Override // defpackage.buf
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof dtv) {
            ((dtv) a).f().a = false;
        }
        return a;
    }

    @Override // defpackage.buf
    public final boolean b(Object obj) {
        if (obj instanceof dtv) {
            ((dtv) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
