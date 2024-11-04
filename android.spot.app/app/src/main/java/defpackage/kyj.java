package defpackage;

import android.support.design.widget.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kyj implements ljp {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_BEACON(1),
    DEVICE_TYPE_HEADPHONES(2),
    DEVICE_TYPE_KEYS(3),
    DEVICE_TYPE_WATCH(4),
    DEVICE_TYPE_WALLET(5),
    DEVICE_TYPE_BAG(7),
    DEVICE_TYPE_LAPTOP(8),
    DEVICE_TYPE_CAR(9),
    DEVICE_TYPE_REMOTE_CONTROL(10),
    DEVICE_TYPE_BADGE(11),
    DEVICE_TYPE_BIKE(12),
    DEVICE_TYPE_CAMERA(13),
    DEVICE_TYPE_CAT(14),
    DEVICE_TYPE_CHARGER(15),
    DEVICE_TYPE_CLOTHING(16),
    DEVICE_TYPE_DOG(17),
    DEVICE_TYPE_NOTEBOOK(18),
    DEVICE_TYPE_PASSPORT(19),
    DEVICE_TYPE_PHONE(20),
    DEVICE_TYPE_SPEAKER(21),
    DEVICE_TYPE_TABLET(22),
    DEVICE_TYPE_TOY(23),
    DEVICE_TYPE_UMBRELLA(24),
    DEVICE_TYPE_STYLUS(25),
    DEVICE_TYPE_EARBUDS(26),
    UNRECOGNIZED(-1);

    private final int B;

    kyj(int i) {
        this.B = i;
    }

    public static kyj b(int i) {
        switch (i) {
            case 0:
                return DEVICE_TYPE_UNKNOWN;
            case 1:
                return DEVICE_TYPE_BEACON;
            case 2:
                return DEVICE_TYPE_HEADPHONES;
            case 3:
                return DEVICE_TYPE_KEYS;
            case 4:
                return DEVICE_TYPE_WATCH;
            case 5:
                return DEVICE_TYPE_WALLET;
            case 6:
            default:
                return null;
            case 7:
                return DEVICE_TYPE_BAG;
            case 8:
                return DEVICE_TYPE_LAPTOP;
            case 9:
                return DEVICE_TYPE_CAR;
            case 10:
                return DEVICE_TYPE_REMOTE_CONTROL;
            case 11:
                return DEVICE_TYPE_BADGE;
            case 12:
                return DEVICE_TYPE_BIKE;
            case 13:
                return DEVICE_TYPE_CAMERA;
            case 14:
                return DEVICE_TYPE_CAT;
            case 15:
                return DEVICE_TYPE_CHARGER;
            case 16:
                return DEVICE_TYPE_CLOTHING;
            case 17:
                return DEVICE_TYPE_DOG;
            case 18:
                return DEVICE_TYPE_NOTEBOOK;
            case 19:
                return DEVICE_TYPE_PASSPORT;
            case 20:
                return DEVICE_TYPE_PHONE;
            case 21:
                return DEVICE_TYPE_SPEAKER;
            case 22:
                return DEVICE_TYPE_TABLET;
            case 23:
                return DEVICE_TYPE_TOY;
            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                return DEVICE_TYPE_UMBRELLA;
            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return DEVICE_TYPE_STYLUS;
            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return DEVICE_TYPE_EARBUDS;
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
