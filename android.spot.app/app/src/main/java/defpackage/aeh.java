package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeh extends mpe implements mnw {
    final /* synthetic */ aei a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeh(aei aeiVar) {
        super(0);
        this.a = aeiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [adc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        Object valueOf;
        boolean z;
        Object obj;
        su suVar = new su(this.a.a.size());
        aei aeiVar = this.a;
        int size = aeiVar.a.size();
        for (int i = 0; i < size; i++) {
            ?? r5 = (adc) aeiVar.a.get(i);
            if (r5.b != null) {
                valueOf = new adb(Integer.valueOf(r5.a), r5.b);
            } else {
                valueOf = Integer.valueOf(r5.a);
            }
            int c = suVar.c(valueOf);
            if (c < 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = null;
            } else {
                obj = suVar.c[c];
            }
            if (obj != null) {
                if (mpp.e(obj)) {
                    List b = mpp.b(obj);
                    b.add(r5);
                    r5 = b;
                } else {
                    r5 = mkm.Q(new Object[]{obj, r5});
                }
            }
            if (z) {
                int i2 = ~c;
                suVar.b[i2] = valueOf;
                suVar.c[i2] = r5;
            } else {
                suVar.c[c] = r5;
            }
        }
        return new ads(suVar);
    }
}
