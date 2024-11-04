package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jit extends jjm implements jkt {
    private static final long serialVersionUID = 0;

    public jit(jiy jiyVar, int i) {
        super(jiyVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            jiu jiuVar = new jiu();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    jin jinVar = new jin();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        jinVar.h(readObject2);
                    }
                    jiuVar.d(readObject, jinVar.g());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException(a.ae(readInt2, "Invalid value count "));
                }
            }
            try {
                try {
                    ((Field) jjk.a.a).set(this, jiuVar.b());
                    try {
                        ((Field) jjk.b.a).set(this, Integer.valueOf(i));
                        return;
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } catch (IllegalArgumentException e3) {
                throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
            }
        }
        throw new InvalidObjectException(a.ae(readInt, "Invalid key count "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hzc.t(this, objectOutputStream);
    }

    @Override // defpackage.jkt
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jis b(Object obj) {
        jis jisVar = (jis) this.map.get(obj);
        if (jisVar == null) {
            int i = jis.d;
            return jmi.a;
        }
        return jisVar;
    }
}
