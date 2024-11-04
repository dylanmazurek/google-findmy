package defpackage;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hyh {
    UWB(0),
    CS(1);

    public final int c;

    hyh(int i) {
        this.c = i;
    }

    public static byte a(List list) {
        if (list.isEmpty()) {
            return (byte) 0;
        }
        BitSet bitSet = new BitSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bitSet.set(((hyh) it.next()).c);
        }
        return bitSet.toByteArray()[0];
    }

    public static jis b(byte b) {
        BitSet valueOf = BitSet.valueOf(new byte[]{b});
        jin jinVar = new jin();
        for (hyh hyhVar : values()) {
            if (valueOf.get(hyhVar.c)) {
                jinVar.h(hyhVar);
            }
        }
        return jinVar.g();
    }
}
