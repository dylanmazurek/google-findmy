package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkk {
    public final dqz a;
    public final buf b;
    private final Class c;
    private final List d;
    private final String e;

    public dkk(Class cls, Class cls2, Class cls3, List list, dqz dqzVar, buf bufVar) {
        this.c = cls;
        this.d = list;
        this.a = dqzVar;
        this.b = bufVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final dlf a(djg djgVar, int i, int i2, div divVar, List list) {
        int size = this.d.size();
        dlf dlfVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            dix dixVar = (dix) this.d.get(i3);
            try {
                if (dixVar.b(djgVar.a(), divVar)) {
                    dlfVar = dixVar.a(djgVar.a(), i, i2, divVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (dlfVar != null) {
                break;
            }
        }
        if (dlfVar != null) {
            return dlfVar;
        }
        throw new dlb(this.e, new ArrayList(list));
    }

    public final String toString() {
        dqz dqzVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + dqzVar.toString() + "}";
    }
}
