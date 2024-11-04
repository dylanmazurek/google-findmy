package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buh extends bug {
    private final Object a;

    public buh(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.bug, defpackage.buf
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.bug, defpackage.buf
    public final boolean b(Object obj) {
        boolean b;
        obj.getClass();
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
