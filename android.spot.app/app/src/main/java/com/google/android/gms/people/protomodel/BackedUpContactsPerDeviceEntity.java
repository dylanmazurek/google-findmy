package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fvq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new fvq(12);
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long d() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        if (!amr.g(f(), backedUpContactsPerDevice.f()) || !amr.g(b(), backedUpContactsPerDevice.b()) || !amr.g(g(), backedUpContactsPerDevice.g()) || !amr.g(e(), backedUpContactsPerDevice.e()) || !amr.g(d(), backedUpContactsPerDevice.d()) || !amr.g(c(), backedUpContactsPerDevice.c()) || !amr.g(a(), backedUpContactsPerDevice.a())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final List g() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                this.h.add((SourceStats) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{f(), b(), g(), e(), d(), c(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 2, str);
        fma.ab(parcel, 3, g());
        fma.X(parcel, 4, this.c);
        fma.V(parcel, 5, this.d);
        fma.V(parcel, 6, this.e);
        fma.V(parcel, 7, this.b);
        fma.W(parcel, 8, this.f, i);
        fma.F(parcel, D);
    }
}
