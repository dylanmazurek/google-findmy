package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjo extends jgi implements Serializable {
    public static final jjo a;
    public static final jjo b;
    private final transient jis c;

    static {
        int i = jis.d;
        a = new jjo(jmi.a);
        b = new jjo(jis.q(jmg.a));
    }

    public jjo(jis jisVar) {
        this.c = jisVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.jmh
    public final /* bridge */ /* synthetic */ Set a() {
        if (this.c.isEmpty()) {
            return jmo.a;
        }
        return new jmp(this.c, jmf.a);
    }

    Object writeReplace() {
        return new jjn(this.c);
    }
}
