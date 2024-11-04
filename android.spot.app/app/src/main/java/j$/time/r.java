package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public r() {
    }

    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.d;
                return g.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.h0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                g gVar2 = g.d;
                return LocalDateTime.a0(g.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.h0(objectInput));
            case 6:
                return ZonedDateTime.V(objectInput);
            case 7:
                int i = w.d;
                return ZoneId.T(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.e0(objectInput);
            case 9:
                return p.T(objectInput);
            case 10:
                return OffsetDateTime.U(objectInput);
            case 11:
                int i2 = t.b;
                return t.R(objectInput.readInt());
            case 12:
                int i3 = v.c;
                return v.S(objectInput.readInt(), objectInput.readByte());
            case 13:
                return m.R(objectInput);
            case 14:
                return q.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).Z(objectOutput);
                return;
            case 3:
                ((g) obj).r0(objectOutput);
                return;
            case 4:
                ((j) obj).m0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).j0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).X(objectOutput);
                return;
            case 7:
                ((w) obj).Y(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((t) obj).V(objectOutput);
                return;
            case 12:
                ((v) obj).Y(objectOutput);
                return;
            case 13:
                ((m) obj).S(objectOutput);
                return;
            case 14:
                ((q) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
