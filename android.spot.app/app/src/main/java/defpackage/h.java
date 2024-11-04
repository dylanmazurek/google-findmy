package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public h(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        lps lpsVar;
        boolean z;
        lqc lqcVar;
        boolean z2;
        char c;
        int i;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Parcelable readParcelable;
        char c2 = 65535;
        Intent intent = null;
        Long l = null;
        switch (this.a) {
            case 0:
                return new i(parcel);
            case 1:
                return new g(parcel);
            case 2:
                return new ay(parcel);
            case 3:
                return new bf(parcel);
            case 4:
                return new bk(parcel);
            case 5:
                return new hn(parcel);
            case 6:
                return new is(parcel);
            case 7:
                return new ks(parcel);
            case 8:
                return new mt(parcel);
            case 9:
                return new mv(parcel);
            case 10:
                parcel.getClass();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new pc(readInt, intent);
            case 11:
                parcel.getClass();
                Parcelable readParcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable2.getClass();
                return new pm((IntentSender) readParcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 12:
                return new bzu(parcel);
            case 13:
                return new cli(parcel);
            case 14:
                return new cxz(parcel);
            case 15:
                parcel.getClass();
                String readString = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray != null) {
                    lps lpsVar2 = lps.d;
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(lpsVar2, createByteArray, 0, createByteArray.length, lja.a);
                    ljn.A(m);
                    lpsVar = (lps) m;
                } else {
                    lpsVar = null;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                if (createByteArray2 != null) {
                    lqc lqcVar2 = lqc.j;
                    lja ljaVar2 = lja.a;
                    lkz lkzVar2 = lkz.a;
                    z = false;
                    ljn m2 = ljn.m(lqcVar2, createByteArray2, 0, createByteArray2.length, lja.a);
                    ljn.A(m2);
                    lqcVar = (lqc) m2;
                } else {
                    z = false;
                    lqcVar = null;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                Long l2 = l;
                lim limVar = (lim) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new edy(readString, lpsVar, lqcVar, z2, l2, limVar, z, (eiv) parcel.readParcelable(edy.class.getClassLoader()), (ekl) parcel.readParcelable(edy.class.getClassLoader()));
            case 16:
                eiv eivVar = (eiv) parcel.readParcelable(efp.class.getClassLoader());
                ekl eklVar = (ekl) parcel.readParcelable(efp.class.getClassLoader());
                jer jerVar = (jer) parcel.readSerializable();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                jer jerVar2 = (jer) parcel.readSerializable();
                jer c3 = efz.t.c(parcel);
                String readString2 = parcel.readString();
                switch (readString2.hashCode()) {
                    case -1271728242:
                        if (readString2.equals("SUPERVISED_LOCATION_SHARING_DISABLED")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -448423784:
                        if (readString2.equals("DEVICE_LOCATION_OFF_IN_SYSTEM")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -302229661:
                        if (readString2.equals("SUPERVISED_GOOGLE_LOCATION_ACCURACY_DISABLED")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2402104:
                        if (readString2.equals("NONE")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 185623582:
                        if (readString2.equals("FMD_DISABLED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1229320147:
                        if (readString2.equals("USER_NOT_PRIVILEGED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1249210556:
                        if (readString2.equals("COULD_NOT_LOCATE")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                if (parcel.readInt() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jer c4 = efz.u.c(parcel);
                String readString3 = parcel.readString();
                switch (readString3.hashCode()) {
                    case -671866390:
                        if (readString3.equals("LOCATION_HISTORY")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1775233:
                        if (readString3.equals("NON_OWNER")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 75627155:
                        if (readString3.equals("OWNER")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 433141802:
                        if (readString3.equals("UNKNOWN")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1230534469:
                        if (readString3.equals("ANDROID_DEVICE_LIVE")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1620616837:
                        if (readString3.equals("AGGREGATED")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    i2 = 1;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 == 5) {
                                        i2 = 1;
                                        i3 = 6;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } else {
                                    i2 = 1;
                                    i3 = 5;
                                }
                            } else {
                                i2 = 1;
                                i3 = 4;
                            }
                        } else {
                            i2 = 1;
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i2 = 1;
                    i3 = 1;
                }
                if (readInt4 == i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (readInt3 == i2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (readInt2 == i2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return new efz(eivVar, eklVar, jerVar, z6, z5, z4, jerVar2, c3, i, z3, c4, i3, efz.r.c(parcel), efz.s.c(parcel), efz.s.c(parcel), efz.r.c(parcel), efz.r.c(parcel));
            case 17:
                jer c5 = eig.b.c(parcel);
                jer c6 = eig.a.c(parcel);
                jer c7 = eig.a.c(parcel);
                jer c8 = eig.a.c(parcel);
                String readString4 = parcel.readString();
                switch (readString4.hashCode()) {
                    case -1986416409:
                        if (readString4.equals("NORMAL")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1560189025:
                        if (readString4.equals("CRITICAL")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 75572:
                        if (readString4.equals("LOW")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 433141802:
                        if (readString4.equals("UNKNOWN")) {
                            c2 = 0;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    i4 = 1;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 == 3) {
                                i5 = 4;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            i5 = 3;
                        }
                    } else {
                        i5 = 2;
                    }
                } else {
                    i4 = 1;
                    i5 = 1;
                }
                if (parcel.readInt() == i4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() == i4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new eig(c5, c6, c7, c8, i5, z7, z8);
            case 18:
                jer c9 = eih.a.c(parcel);
                int readInt5 = parcel.readInt();
                jer c10 = eih.b.c(parcel);
                if (parcel.readInt() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Boolean valueOf = Boolean.valueOf(z9);
                eyt eytVar = eih.c;
                int readInt6 = parcel.readInt();
                jiu h = jiy.h(readInt6);
                for (int i6 = 0; i6 < readInt6; i6++) {
                    Enum a = ((ezb) eytVar.b).a(parcel);
                    Class cls = ((ezb) eytVar.a).a;
                    ClassLoader classLoader = cls.getClassLoader();
                    if (Build.VERSION.SDK_INT >= 34) {
                        readParcelable = btd.b(parcel, classLoader, cls);
                    } else {
                        readParcelable = parcel.readParcelable(classLoader);
                        if (readParcelable != null && !cls.isInstance(readParcelable)) {
                            throw new BadParcelableException("Parcelable " + readParcelable.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
                        }
                    }
                    readParcelable.getClass();
                    h.d(a, readParcelable);
                }
                if (readInt5 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new eih(c9, z10, c10, valueOf, h.b(), eih.a.c(parcel));
            case 19:
                return new eii(eii.a.c(parcel), eii.b.c(parcel), eii.e.c(parcel), eii.e.c(parcel), eii.c.c(parcel), (ifj) eii.f.a(parcel), (ekj) eii.g.a(parcel), eii.d.c(parcel));
            default:
                return new eij((eiv) parcel.readParcelable(elg.class.getClassLoader()), (ekl) parcel.readParcelable(elg.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new i[i];
            case 1:
                return new g[i];
            case 2:
                return new ay[i];
            case 3:
                return new bf[i];
            case 4:
                return new bk[i];
            case 5:
                return new hn[i];
            case 6:
                return new is[i];
            case 7:
                return new ks[i];
            case 8:
                return new mt[i];
            case 9:
                return new mv[i];
            case 10:
                return new pc[i];
            case 11:
                return new pm[i];
            case 12:
                return new bzu[i];
            case 13:
                return new cli[i];
            case 14:
                return new cxz[i];
            case 15:
                return new edy[i];
            case 16:
                return new efz[i];
            case 17:
                return new eig[i];
            case 18:
                return new eih[i];
            case 19:
                return new eii[i];
            default:
                return new eij[i];
        }
    }
}
