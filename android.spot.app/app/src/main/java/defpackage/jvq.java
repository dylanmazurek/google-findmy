package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvq extends jhy implements Serializable, jkt {
    final jkt a;
    transient Collection b;
    transient Map c;

    public jvq(jkt jktVar) {
        this.a = jktVar;
    }

    @Override // defpackage.jhy
    protected final jkt a() {
        return this.a;
    }

    @Override // defpackage.jhy, defpackage.jib, defpackage.jls
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        return b(obj);
    }

    @Override // defpackage.jhy, defpackage.jib
    /* renamed from: c */
    protected final /* synthetic */ jls g() {
        return this.a;
    }

    @Override // defpackage.jhy, defpackage.jkt
    /* renamed from: d */
    public final List b(Object obj) {
        return new jvn(this.a.b(obj));
    }

    @Override // defpackage.jib, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jib, defpackage.jls
    public final boolean o(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.o(obj, obj2);
    }

    @Override // defpackage.jib, defpackage.jls
    public final Collection p() {
        Collection collection = this.b;
        if (collection == null) {
            jvm jvmVar = new jvm(this.a.p());
            this.b = jvmVar;
            return jvmVar;
        }
        return collection;
    }

    @Override // defpackage.jib, defpackage.jls
    public final Map q() {
        Map map = this.c;
        if (map == null) {
            jvp jvpVar = new jvp(this, this.a.q());
            this.c = jvpVar;
            return jvpVar;
        }
        return map;
    }
}
