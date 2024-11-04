package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sq extends sx implements Set, mpt {
    final /* synthetic */ sy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(sy syVar) {
        super(syVar);
        this.a = syVar;
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.i(obj);
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.j(collection);
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sp(this.a);
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:            if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:            r12 = -1;     */
    @Override // defpackage.sx, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            r0 = r18
            r19.getClass()
            sy r1 = r0.a
            int r1 = r1.d
            java.util.Iterator r2 = r19.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            sy r6 = r0.a
            if (r3 == 0) goto L22
            int r7 = r3.hashCode()
            goto L23
        L22:
            r7 = 0
        L23:
            int r8 = r6.c
            r9 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r9
            int r9 = r7 << 16
            r7 = r7 ^ r9
            int r9 = r7 >>> 7
            r9 = r9 & r8
        L30:
            r10 = r7 & 127(0x7f, float:1.78E-43)
            long[] r11 = r6.a
            r12 = r9 & 7
            int r13 = r9 >> 3
            r14 = r11[r13]
            int r12 = r12 << 3
            long r14 = r14 >>> r12
            int r13 = r13 + r4
            r16 = r11[r13]
            int r11 = 64 - r12
            long r16 = r16 << r11
            long r11 = (long) r12
            long r11 = -r11
            r13 = r5
            long r4 = (long) r10
            r10 = 63
            long r10 = r11 >> r10
            long r10 = r16 & r10
            long r10 = r10 | r14
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r14
            long r4 = r4 ^ r10
            r14 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r14 = r14 + r4
            long r4 = ~r4
            long r4 = r4 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r14
        L65:
            r16 = 0
            int r12 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r12 == 0) goto L88
            int r12 = java.lang.Long.numberOfTrailingZeros(r4)
            int r12 = r12 >> 3
            int r12 = r12 + r9
            r12 = r12 & r8
            java.lang.Object[] r14 = r6.b
            r14 = r14[r12]
            boolean r14 = defpackage.amr.i(r14, r3)
            if (r14 == 0) goto L7e
            goto L97
        L7e:
            r14 = -1
            long r14 = r14 + r4
            long r4 = r4 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L65
        L88:
            long r4 = ~r10
            r12 = 6
            long r4 = r4 << r12
            long r4 = r4 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r10
            int r10 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r10 == 0) goto L9e
            r12 = -1
        L97:
            if (r12 < 0) goto Ld
            r6.h(r12)
            goto Ld
        L9e:
            int r5 = r13 + 8
            int r9 = r9 + r5
            r9 = r9 & r8
            r4 = 1
            goto L30
        La4:
            sy r2 = r0.a
            int r2 = r2.d
            if (r1 == r2) goto Lac
            r1 = 1
            return r1
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq.removeAll(java.util.Collection):boolean");
    }

    @Override // defpackage.sx, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        long[] jArr = this.a.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        sy syVar = this.a;
                        int i5 = (i2 << 3) + i4;
                        if (!collection.contains(syVar.b[i5])) {
                            syVar.h(i5);
                            z = true;
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    break;
                }
            }
            if (i2 == length) {
                break;
            }
            i2++;
        }
        return z;
    }
}
