package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.j;
import j$.time.k;
import j$.time.temporal.m;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final k a;
    private final byte b;
    private final j$.time.d c;
    private final j d;
    private final boolean e;
    private final c f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    d(k kVar, int i, j$.time.d dVar, j jVar, boolean z, c cVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = dVar;
        this.d = jVar;
        this.e = z;
        this.f = cVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(ObjectInput objectInput) {
        j$.time.d R;
        j Z;
        int i;
        ZoneOffset c0;
        ZoneOffset c02;
        boolean z;
        int readInt = objectInput.readInt();
        k U = k.U(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        if (i3 == 0) {
            R = null;
        } else {
            R = j$.time.d.R(i3);
        }
        j$.time.d dVar = R;
        int i4 = (507904 & readInt) >>> 14;
        c cVar = c.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        if (i4 == 31) {
            Z = j.b0(objectInput.readInt());
        } else {
            Z = j.Z(i4 % 24);
        }
        if (i5 == 255) {
            i = objectInput.readInt();
        } else {
            i = (i5 - 128) * 900;
        }
        ZoneOffset c03 = ZoneOffset.c0(i);
        if (i6 == 3) {
            c0 = ZoneOffset.c0(objectInput.readInt());
        } else {
            c0 = ZoneOffset.c0((i6 * 1800) + c03.Z());
        }
        ZoneOffset zoneOffset = c0;
        if (i7 == 3) {
            c02 = ZoneOffset.c0(objectInput.readInt());
        } else {
            c02 = ZoneOffset.c0((i7 * 1800) + c03.Z());
        }
        if (i4 == 24) {
            z = true;
        } else {
            z = false;
        }
        Objects.a(U, "month");
        Objects.a(Z, "time");
        Objects.a(cVar, "timeDefnition");
        if (i2 >= -28 && i2 <= 31 && i2 != 0) {
            if (z && !Z.equals(j.g)) {
                throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
            }
            if (Z.X() == 0) {
                return new d(U, i2, dVar, Z, z, cVar, c03, zoneOffset, c02);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        j$.time.g g0;
        k kVar = this.a;
        j$.time.d dVar = this.c;
        byte b = this.b;
        if (b < 0) {
            u.d.getClass();
            g0 = j$.time.g.g0(i, kVar, kVar.S(u.q(i)) + 1 + b);
            if (dVar != null) {
                final int value = dVar.getValue();
                final int i2 = 1;
                g0 = g0.q(new m() { // from class: j$.time.temporal.n
                    @Override // j$.time.temporal.m
                    public final Temporal F(Temporal temporal) {
                        int i3;
                        int i4;
                        switch (i2) {
                            case 0:
                                int n = temporal.n(a.DAY_OF_WEEK);
                                int i5 = value;
                                if (n != i5) {
                                    int i6 = n - i5;
                                    if (i6 >= 0) {
                                        i3 = 7 - i6;
                                    } else {
                                        i3 = -i6;
                                    }
                                    return temporal.e(i3, ChronoUnit.DAYS);
                                }
                                return temporal;
                            default:
                                int n2 = temporal.n(a.DAY_OF_WEEK);
                                int i7 = value;
                                if (n2 != i7) {
                                    int i8 = i7 - n2;
                                    if (i8 >= 0) {
                                        i4 = 7 - i8;
                                    } else {
                                        i4 = -i8;
                                    }
                                    return temporal.k(i4, ChronoUnit.DAYS);
                                }
                                return temporal;
                        }
                    }
                });
            }
        } else {
            g0 = j$.time.g.g0(i, kVar, b);
            if (dVar != null) {
                final int value2 = dVar.getValue();
                final int i3 = 0;
                g0 = g0.q(new m() { // from class: j$.time.temporal.n
                    @Override // j$.time.temporal.m
                    public final Temporal F(Temporal temporal) {
                        int i32;
                        int i4;
                        switch (i3) {
                            case 0:
                                int n = temporal.n(a.DAY_OF_WEEK);
                                int i5 = value2;
                                if (n != i5) {
                                    int i6 = n - i5;
                                    if (i6 >= 0) {
                                        i32 = 7 - i6;
                                    } else {
                                        i32 = -i6;
                                    }
                                    return temporal.e(i32, ChronoUnit.DAYS);
                                }
                                return temporal;
                            default:
                                int n2 = temporal.n(a.DAY_OF_WEEK);
                                int i7 = value2;
                                if (n2 != i7) {
                                    int i8 = i7 - n2;
                                    if (i8 >= 0) {
                                        i4 = 7 - i8;
                                    } else {
                                        i4 = -i8;
                                    }
                                    return temporal.k(i4, ChronoUnit.DAYS);
                                }
                                return temporal;
                        }
                    }
                });
            }
        }
        if (this.e) {
            g0 = g0.j0(1L);
        }
        LocalDateTime a0 = LocalDateTime.a0(g0, this.d);
        int ordinal = this.f.ordinal();
        ZoneOffset zoneOffset = this.h;
        if (ordinal != 0) {
            if (ordinal == 2) {
                a0 = a0.d0(zoneOffset.Z() - this.g.Z());
            }
        } else {
            a0 = a0.d0(zoneOffset.Z() - ZoneOffset.UTC.Z());
        }
        return new b(a0, zoneOffset, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int ordinal;
        int j0 = ((this.d.j0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.d dVar = this.c;
        if (dVar == null) {
            ordinal = 7;
        } else {
            ordinal = dVar.ordinal();
        }
        return ((this.g.hashCode() ^ (this.f.ordinal() + (j0 + (ordinal << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        String str;
        String jVar;
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        if (zoneOffset.compareTo(zoneOffset2) > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        sb.append(str);
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        k kVar = this.a;
        byte b = this.b;
        j$.time.d dVar = this.c;
        if (dVar != null) {
            if (b == -1) {
                sb.append(dVar.name());
                sb.append(" on or before last day of ");
                sb.append(kVar.name());
            } else if (b < 0) {
                sb.append(dVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-b) - 1);
                sb.append(" of ");
                sb.append(kVar.name());
            } else {
                sb.append(dVar.name());
                sb.append(" on or after ");
                sb.append(kVar.name());
                sb.append(' ');
                sb.append((int) b);
            }
        } else {
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        if (this.e) {
            jVar = "24:00";
        } else {
            jVar = this.d.toString();
        }
        sb.append(jVar);
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        int j0;
        int i;
        int i2;
        int i3;
        int i4;
        int value;
        j jVar = this.d;
        boolean z = this.e;
        if (z) {
            j0 = 86400;
        } else {
            j0 = jVar.j0();
        }
        int Z = this.g.Z();
        ZoneOffset zoneOffset = this.h;
        int Z2 = zoneOffset.Z() - Z;
        ZoneOffset zoneOffset2 = this.i;
        int Z3 = zoneOffset2.Z() - Z;
        if (j0 % 3600 == 0) {
            if (z) {
                i = 24;
            } else {
                i = jVar.V();
            }
        } else {
            i = 31;
        }
        if (Z % 900 == 0) {
            i2 = (Z / 900) + 128;
        } else {
            i2 = 255;
        }
        if (Z2 != 0 && Z2 != 1800 && Z2 != 3600) {
            i3 = 3;
        } else {
            i3 = Z2 / 1800;
        }
        if (Z3 != 0 && Z3 != 1800 && Z3 != 3600) {
            i4 = 3;
        } else {
            i4 = Z3 / 1800;
        }
        j$.time.d dVar = this.c;
        if (dVar == null) {
            value = 0;
        } else {
            value = dVar.getValue();
        }
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + (value << 19) + (i << 14) + (this.f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            objectOutput.writeInt(j0);
        }
        if (i2 == 255) {
            objectOutput.writeInt(Z);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.Z());
        }
        if (i4 == 3) {
            objectOutput.writeInt(zoneOffset2.Z());
        }
    }
}
