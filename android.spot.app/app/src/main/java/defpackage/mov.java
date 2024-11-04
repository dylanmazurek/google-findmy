package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mov implements Serializable, mqk {
    public static final Object b = mou.a;
    private transient mqk a;
    protected final Object c;
    public final String d;
    public final String e;
    private final Class f;
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: protected */
    public mov(Object obj, Class cls, String str, String str2, boolean z) {
        this.c = obj;
        this.f = cls;
        this.d = str;
        this.e = str2;
        this.g = z;
    }

    @Override // defpackage.mqk
    public final String c() {
        return this.d;
    }

    public final mqk e() {
        mqk mqkVar = this.a;
        if (mqkVar == null) {
            h();
            this.a = this;
            return this;
        }
        return mqkVar;
    }

    public final mqm f() {
        mqm moxVar;
        Class cls = this.f;
        if (cls == null) {
            return null;
        }
        if (this.g) {
            moxVar = new mph(cls);
        } else {
            int i = mpo.a;
            moxVar = new mox(cls);
        }
        return moxVar;
    }

    @Override // defpackage.mqk
    public final Object g() {
        throw null;
    }

    protected abstract void h();
}
