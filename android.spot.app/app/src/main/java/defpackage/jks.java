package defpackage;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jks extends jgh implements Serializable, jkt {
    private static final long serialVersionUID = 0;
    public transient jkp a;
    public transient jkp b;
    public transient Map d;
    public transient int e;
    public transient int f;

    public jks() {
        this(12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new jhd();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            o(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e);
        for (Map.Entry entry : p()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final jkp a(Object obj, Object obj2, jkp jkpVar) {
        jkp jkpVar2 = new jkp(obj, obj2);
        if (this.a == null) {
            this.b = jkpVar2;
            this.a = jkpVar2;
            this.d.put(obj, new jko(jkpVar2));
            this.f++;
        } else if (jkpVar == null) {
            jkp jkpVar3 = this.b;
            jkpVar3.getClass();
            jkpVar3.c = jkpVar2;
            jkpVar2.d = jkpVar3;
            this.b = jkpVar2;
            jko jkoVar = (jko) this.d.get(obj);
            if (jkoVar == null) {
                this.d.put(obj, new jko(jkpVar2));
                this.f++;
            } else {
                jkoVar.a++;
                jkp jkpVar4 = (jkp) jkoVar.c;
                jkpVar4.e = jkpVar2;
                jkpVar2.f = jkpVar4;
                jkoVar.c = jkpVar2;
            }
        } else {
            jko jkoVar2 = (jko) this.d.get(obj);
            jkoVar2.getClass();
            jkoVar2.a++;
            jkpVar2.d = jkpVar.d;
            jkpVar2.f = jkpVar.f;
            jkpVar2.c = jkpVar;
            jkpVar2.e = jkpVar;
            jkp jkpVar5 = jkpVar.f;
            if (jkpVar5 == null) {
                jkoVar2.b = jkpVar2;
            } else {
                jkpVar5.e = jkpVar2;
            }
            jkp jkpVar6 = jkpVar.d;
            if (jkpVar6 == null) {
                this.a = jkpVar2;
            } else {
                jkpVar6.c = jkpVar2;
            }
            jkpVar.d = jkpVar2;
            jkpVar.f = jkpVar2;
        }
        this.e++;
        return jkpVar2;
    }

    @Override // defpackage.jls
    public final /* synthetic */ Collection b(Object obj) {
        return new jkk(this, obj);
    }

    @Override // defpackage.jgh, defpackage.jls
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List p() {
        return (List) super.p();
    }

    @Override // defpackage.jkt
    /* renamed from: d */
    public final List b(Object obj) {
        return new jkk(this, obj);
    }

    @Override // defpackage.jls
    public final int e() {
        return this.e;
    }

    @Override // defpackage.jgh
    public final /* synthetic */ Collection f() {
        return new jkl(this);
    }

    @Override // defpackage.jgh
    public final /* synthetic */ Collection g() {
        throw null;
    }

    @Override // defpackage.jgh
    public final Iterator h() {
        throw null;
    }

    public final List i(Object obj) {
        List unmodifiableList = DesugarCollections.unmodifiableList(hzc.H(new jkr(this, obj)));
        m(obj);
        return unmodifiableList;
    }

    @Override // defpackage.jgh
    public final Map j() {
        return new jlv(this);
    }

    @Override // defpackage.jgh
    public final Set k() {
        return new jkm(this);
    }

    @Override // defpackage.jls
    public final void l() {
        throw null;
    }

    public final void m(Object obj) {
        hzc.P(new jkr(this, obj));
    }

    @Override // defpackage.jls
    public final boolean n(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.jgh, defpackage.jls
    public final boolean o(Object obj, Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.jgh, defpackage.jls
    public final /* bridge */ /* synthetic */ boolean s(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.jgh, defpackage.jls
    public final /* bridge */ /* synthetic */ boolean u(Object obj, Object obj2) {
        throw null;
    }

    public final void v(jkp jkpVar) {
        jkp jkpVar2 = jkpVar.d;
        if (jkpVar2 != null) {
            jkpVar2.c = jkpVar.c;
        } else {
            this.a = jkpVar.c;
        }
        jkp jkpVar3 = jkpVar.c;
        if (jkpVar3 != null) {
            jkpVar3.d = jkpVar2;
        } else {
            this.b = jkpVar2;
        }
        if (jkpVar.f == null && jkpVar.e == null) {
            jko jkoVar = (jko) this.d.remove(jkpVar.a);
            jkoVar.getClass();
            jkoVar.a = 0;
            this.f++;
        } else {
            jko jkoVar2 = (jko) this.d.get(jkpVar.a);
            jkoVar2.getClass();
            jkoVar2.a--;
            jkp jkpVar4 = jkpVar.f;
            if (jkpVar4 == null) {
                jkp jkpVar5 = jkpVar.e;
                jkpVar5.getClass();
                jkoVar2.b = jkpVar5;
            } else {
                jkpVar4.e = jkpVar.e;
            }
            jkp jkpVar6 = jkpVar.e;
            if (jkpVar6 == null) {
                jkpVar4.getClass();
                jkoVar2.c = jkpVar4;
            } else {
                jkpVar6.f = jkpVar4;
            }
        }
        this.e--;
    }

    public jks(int i) {
        this.d = new jha(i);
    }

    public jks(jls jlsVar) {
        this(jlsVar.r().size());
        for (Map.Entry entry : jlsVar.p()) {
            o(entry.getKey(), entry.getValue());
        }
    }
}
