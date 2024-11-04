package j$.time.zone;

import j$.nio.file.attribute.s;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0040i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long[] i = new long[0];
    private static final d[] j = new d[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final d[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private e(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.F()) {
                    arrayList.add(bVar.n());
                    arrayList.add(bVar.k());
                } else {
                    arrayList.add(bVar.k());
                    arrayList.add(bVar.n());
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime n = bVar.n();
        if (bVar.F()) {
            if (localDateTime.Y(n)) {
                return bVar.w();
            }
            if (localDateTime.Y(bVar.k())) {
                return bVar;
            }
            return bVar.r();
        }
        if (!localDateTime.Y(n)) {
            return bVar.r();
        }
        if (localDateTime.Y(bVar.k())) {
            return bVar.w();
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i2) {
        long j2;
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr2 = l;
            if (i2 < 1800) {
                return bVarArr2;
            }
            long n = AbstractC0040i.n(LocalDateTime.Z(i2 - 1), this.b[0]);
            int offset = timeZone.getOffset(n * 1000);
            long j3 = 31968000 + n;
            while (n < j3) {
                long j4 = 7776000 + n;
                long j5 = n;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    n = j5;
                    while (j4 - n > 1) {
                        int i3 = offset;
                        long j6 = j3;
                        long f = s.f(j4 + n, 2L);
                        if (timeZone.getOffset(f * 1000) == i3) {
                            n = f;
                        } else {
                            j4 = f;
                        }
                        offset = i3;
                        j3 = j6;
                    }
                    j2 = j3;
                    int i4 = offset;
                    if (timeZone.getOffset(n * 1000) == i4) {
                        n = j4;
                    }
                    ZoneOffset i5 = i(i4);
                    offset = timeZone.getOffset(n * 1000);
                    ZoneOffset i6 = i(offset);
                    if (c(n, i6) == i2) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(n, i5, i6);
                    }
                } else {
                    j2 = j3;
                    n = j4;
                }
                j3 = j2;
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        d[] dVarArr = this.f;
        b[] bVarArr3 = new b[dVarArr.length];
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            bVarArr3[i7] = dVarArr[i7].a(i2);
        }
        if (i2 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.g.h0(s.f(j2 + zoneOffset.Z(), 86400)).a0();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] b = b(localDateTime.getYear());
            if (b.length == 0) {
                return i(timeZone.getOffset(AbstractC0040i.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if (!(a instanceof b) && !a.equals(bVar.w())) {
                    i2++;
                    obj = a;
                } else {
                    return a;
                }
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.X(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] b2 = b(localDateTime.getYear());
            int length3 = b2.length;
            while (i2 < length3) {
                b bVar2 = b2[i2];
                Object a2 = a(localDateTime, bVar2);
                if (!(a2 instanceof b) && !a2.equals(bVar2.w())) {
                    i2++;
                    obj = a2;
                } else {
                    return a2;
                }
            }
            return obj;
        }
        int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (binarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < localDateTimeArr.length - 1) {
            int i3 = binarySearch + 1;
            if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i3])) {
                binarySearch = i3;
            }
        }
        if ((binarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
            int i4 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
            if (zoneOffset2.Z() > zoneOffset.Z()) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(binarySearch / 2) + 1];
    }

    public static e h(ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return new e(zoneOffset);
    }

    private static ZoneOffset i(int i2) {
        return ZoneOffset.c0(i2 / 1000);
    }

    public static e j(ObjectInput objectInput) {
        long[] jArr;
        d[] dVarArr;
        int readInt = objectInput.readInt();
        long[] jArr2 = i;
        if (readInt == 0) {
            jArr = jArr2;
        } else {
            jArr = new long[readInt];
        }
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a.a(objectInput);
        }
        int i3 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            zoneOffsetArr[i4] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr2 = new long[readInt2];
        }
        long[] jArr3 = jArr2;
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr3[i5] = a.a(objectInput);
        }
        int i6 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            zoneOffsetArr2[i7] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        if (readByte == 0) {
            dVarArr = j;
        } else {
            dVarArr = new d[readByte];
        }
        d[] dVarArr2 = dVarArr;
        for (int i8 = 0; i8 < readByte; i8++) {
            dVarArr2[i8] = d.b(objectInput);
        }
        return new e(jArr, zoneOffsetArr, jArr3, zoneOffsetArr2, dVarArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        byte b;
        if (this.g != null) {
            b = 100;
        } else {
            b = 1;
        }
        return new a(b, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long U = instant.U();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && U > jArr[jArr.length - 1]) {
            b[] b = b(c(U, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                bVar = b[i2];
                if (U < bVar.Q()) {
                    return bVar.w();
                }
            }
            return bVar.r();
        }
        int binarySearch = Arrays.binarySearch(jArr, U);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Objects.equals(this.g, eVar.g) && Arrays.equals(this.a, eVar.a) && Arrays.equals(this.b, eVar.b) && Arrays.equals(this.c, eVar.c) && Arrays.equals(this.e, eVar.e) && Arrays.equals(this.f, eVar.f)) {
            return true;
        }
        return false;
    }

    public final b f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (e instanceof b) {
            return (b) e;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (e instanceof b) {
            return ((b) e).B();
        }
        return Collections.singletonList((ZoneOffset) e);
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.g.getID());
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r1.length - 1]) + "]";
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.a;
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.c;
        objectOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            a.d(zoneOffset2, objectOutput);
        }
        d[] dVarArr = this.f;
        objectOutput.writeByte(dVarArr.length);
        for (d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    private e(ZoneOffset zoneOffset) {
        this.b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public e(TimeZone timeZone) {
        this.b = r0;
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
