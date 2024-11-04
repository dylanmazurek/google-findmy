package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btd {
    static Parcelable.Creator a(Parcel parcel, ClassLoader classLoader, Class cls) {
        Parcelable.Creator readParcelableCreator;
        readParcelableCreator = parcel.readParcelableCreator(classLoader, cls);
        return readParcelableCreator;
    }

    public static Parcelable b(Parcel parcel, ClassLoader classLoader, Class cls) {
        Object readParcelable;
        readParcelable = parcel.readParcelable(classLoader, cls);
        return (Parcelable) readParcelable;
    }

    static SparseArray c(Parcel parcel, ClassLoader classLoader, Class cls) {
        SparseArray readSparseArray;
        readSparseArray = parcel.readSparseArray(classLoader, cls);
        return readSparseArray;
    }

    static Serializable d(Parcel parcel, ClassLoader classLoader, Class cls) {
        Object readSerializable;
        readSerializable = parcel.readSerializable(classLoader, cls);
        return (Serializable) readSerializable;
    }

    static ArrayList e(Parcel parcel, ClassLoader classLoader, Class cls) {
        ArrayList readArrayList;
        readArrayList = parcel.readArrayList(classLoader, cls);
        return readArrayList;
    }

    static HashMap f(Parcel parcel, ClassLoader classLoader, Class cls, Class cls2) {
        HashMap readHashMap;
        readHashMap = parcel.readHashMap(classLoader, cls, cls2);
        return readHashMap;
    }

    static List g(Parcel parcel, List list, ClassLoader classLoader, Class cls) {
        List readParcelableList;
        readParcelableList = parcel.readParcelableList(list, classLoader, cls);
        return readParcelableList;
    }

    static void h(Parcel parcel, List list, ClassLoader classLoader, Class cls) {
        parcel.readList(list, classLoader, cls);
    }

    static void i(Parcel parcel, Map map, ClassLoader classLoader, Class cls, Class cls2) {
        parcel.readMap(map, classLoader, cls, cls2);
    }

    static Object[] j(Parcel parcel, ClassLoader classLoader, Class cls) {
        Object[] readArray;
        readArray = parcel.readArray(classLoader, cls);
        return readArray;
    }

    static Object[] k(Parcel parcel, ClassLoader classLoader, Class cls) {
        Object[] readParcelableArray;
        readParcelableArray = parcel.readParcelableArray(classLoader, cls);
        return readParcelableArray;
    }

    public static final Object l(cfc cfcVar, cew cewVar, mol molVar, mmx mmxVar) {
        Object l;
        cex N = cfcVar.N();
        if (cewVar != cew.INITIALIZED) {
            if (N.b == cew.DESTROYED || (l = msz.l(new cft(N, cewVar, molVar, null), mmxVar)) != mne.a) {
                l = mlh.a;
            }
            if (l == mne.a) {
                return l;
            }
            return mlh.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
