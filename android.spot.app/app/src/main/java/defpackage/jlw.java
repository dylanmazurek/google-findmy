package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlw extends jfn {
    private static final long serialVersionUID = 0;
    transient jfe d;

    public jlw(Map map, jfe jfeVar) {
        super(map);
        this.d = jfeVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.d = (jfe) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        m((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.d);
        objectOutputStream.writeObject(((jge) this).a);
    }

    @Override // defpackage.jfn, defpackage.jge
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.d.a();
    }

    @Override // defpackage.jge, defpackage.jgh
    public final Map j() {
        Map map = ((jge) this).a;
        if (map instanceof NavigableMap) {
            return new jfu(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new jfx(this, (SortedMap) map);
        }
        return new jfq(this, map);
    }

    @Override // defpackage.jge, defpackage.jgh
    public final Set k() {
        Map map = ((jge) this).a;
        if (map instanceof NavigableMap) {
            return new jfv(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new jfy(this, (SortedMap) map);
        }
        return new jft(this, map);
    }
}
