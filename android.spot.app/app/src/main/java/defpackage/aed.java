package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aed implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a */
    public final aee createFromParcel(Parcel parcel, ClassLoader classLoader) {
        agk agkVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    agkVar = afo.a;
                } else {
                    throw new IllegalStateException(a.am(readInt, "Unsupported MutableState policy ", " was restored"));
                }
            } else {
                agkVar = agw.a;
            }
        } else {
            agkVar = adu.a;
        }
        return new aee(readValue, agkVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aee[i];
    }
}
