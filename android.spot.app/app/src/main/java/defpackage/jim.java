package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jim extends jjr {
    private final transient EnumSet a;
    private transient int b;

    public jim(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static jjr h(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            if (size != 1) {
                return new jim(enumSet);
            }
            return new jms((Enum) hzc.Y(enumSet));
        }
        return jmo.a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof jim) {
            collection = ((jim) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return hzc.M(this.a.iterator());
    }

    @Override // defpackage.jjr, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jim) {
            obj = ((jim) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.jih
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jjr, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.jjr
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return new jil(this.a);
    }
}
