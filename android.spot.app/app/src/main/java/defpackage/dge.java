package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dge {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List h;

    public dge(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dge a(dgf dgfVar) {
        List arrayList;
        if (dgg.a(dgfVar) == 538247942) {
            String e = dgg.e(dgfVar);
            String e2 = dgg.e(dgfVar);
            long b = dgg.b(dgfVar);
            long b2 = dgg.b(dgfVar);
            long b3 = dgg.b(dgfVar);
            long b4 = dgg.b(dgfVar);
            int a = dgg.a(dgfVar);
            if (a >= 0) {
                if (a == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < a; i++) {
                    list.add(new dfl(dgg.e(dgfVar).intern(), dgg.e(dgfVar).intern()));
                }
                return new dge(e, e2, b, b2, b3, b4, list);
            }
            throw new IOException(a.ae(a, "readHeaderList size="));
        }
        throw new IOException();
    }
}
