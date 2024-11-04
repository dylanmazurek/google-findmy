package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcx implements cfo {
    final /* synthetic */ hcy a;
    private final int b;

    public hcx(hcy hcyVar, int i) {
        this.a = hcyVar;
        this.b = i;
    }

    @Override // defpackage.cfo
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        boolean equals;
        if (((Boolean) obj).booleanValue()) {
            hcy hcyVar = this.a;
            int i = this.b;
            imr imrVar = hcyVar.e;
            Integer valueOf = Integer.valueOf(i);
            int g = imrVar.g(valueOf, (Object[]) imrVar.d, imrVar.a, 1);
            if (g == -1) {
                g = 0;
            } else if (g < imrVar.a) {
                Object obj2 = ((Object[]) imrVar.d)[g];
                Object obj3 = imrVar.c;
                equals = ((Integer) obj2).equals(valueOf);
                if (equals) {
                    Object obj4 = imrVar.c;
                    if (((Integer) obj2).equals(valueOf)) {
                        ((Object[]) imrVar.d)[g] = valueOf;
                        return;
                    } else {
                        ((Object[]) imrVar.d)[g] = valueOf;
                        ((fg) imrVar.c).a.o(g, 1);
                        return;
                    }
                }
            }
            int i2 = imrVar.a;
            if (g <= i2) {
                int i3 = g + 1;
                Object obj5 = imrVar.d;
                int length = ((Object[]) obj5).length;
                if (i2 == length) {
                    Object[] objArr = (Object[]) Array.newInstance((Class<?>) imrVar.b, length + 10);
                    System.arraycopy(imrVar.d, 0, objArr, 0, g);
                    objArr[g] = valueOf;
                    System.arraycopy(imrVar.d, g, objArr, i3, imrVar.a - g);
                    imrVar.d = objArr;
                } else {
                    System.arraycopy(obj5, g, obj5, i3, i2 - g);
                    ((Object[]) imrVar.d)[g] = valueOf;
                }
                imrVar.a++;
                ((fg) imrVar.c).a.h(g, 1);
                return;
            }
            throw new IndexOutOfBoundsException("cannot add item to " + g + " because size is " + imrVar.a);
        }
        hcy hcyVar2 = this.a;
        int i4 = this.b;
        imr imrVar2 = hcyVar2.e;
        int g2 = imrVar2.g(Integer.valueOf(i4), (Object[]) imrVar2.d, imrVar2.a, 2);
        if (g2 == -1) {
            return;
        }
        Object obj6 = imrVar2.d;
        System.arraycopy(obj6, g2 + 1, obj6, g2, (imrVar2.a - g2) - 1);
        int i5 = imrVar2.a - 1;
        imrVar2.a = i5;
        ((Object[]) imrVar2.d)[i5] = null;
        ((fg) imrVar2.c).b(g2, 1);
    }
}
