package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jik extends jiw {
    private final transient EnumMap a;

    public jik(EnumMap enumMap) {
        this.a = enumMap;
        hwx.J(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.jiw
    public final jmw a() {
        return new jli(this.a.entrySet().iterator());
    }

    @Override // defpackage.jiy
    public final jmw b() {
        return hzc.M(this.a.keySet().iterator());
    }

    @Override // defpackage.jiy, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.jiy, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jik) {
            obj = ((jik) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.jiy, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.jiw, defpackage.jiy
    public Object writeReplace() {
        return new jij(this.a);
    }

    @Override // defpackage.jiy
    public final void c() {
    }
}
