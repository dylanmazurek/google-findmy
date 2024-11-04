package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqw extends jqv {
    public static final Map c;
    private final jor d;

    static {
        EnumMap enumMap = new EnumMap(jor.class);
        for (jor jorVar : jor.values()) {
            jqw[] jqwVarArr = new jqw[10];
            for (int i = 0; i < 10; i++) {
                jqwVarArr[i] = new jqw(i, jorVar, jos.a);
            }
            enumMap.put((EnumMap) jorVar, (jor) jqwVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public jqw(int i, jor jorVar, jos josVar) {
        super(josVar, i);
        jorVar.getClass();
        this.d = jorVar;
        if (josVar.c()) {
            return;
        }
        int i2 = jorVar.l;
        i2 = josVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        josVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.jqv
    public final void a(jqz jqzVar, Object obj) {
        jqzVar.d(obj, this.d, this.b);
    }
}
