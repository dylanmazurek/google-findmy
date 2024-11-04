package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.mdisync.internal.SyncResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fen extends dug implements IInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i, char[] cArr) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, frg] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, frh] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, fri] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, frj] */
    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        fsf fsfVar;
        fsf fsfVar2;
        AccessibilityManager accessibilityManager;
        fsf fsfVar3 = null;
        byte[] bArr = null;
        fsf fsfVar4 = null;
        fsf fsfVar5 = null;
        fsf fsfVar6 = null;
        fsf fsfVar7 = null;
        fsf fsfVar8 = null;
        switch (this.b) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                duh.b(parcel);
                fes.a(status, createTypedArrayList, (bym) this.a);
                return true;
            case 1:
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) duh.a(parcel, Bundle.CREATOR);
                duh.b(parcel);
                fes.a(status2, bundle, (bym) this.a);
                return true;
            case 2:
                if (i != 2) {
                    return false;
                }
                Status status3 = (Status) duh.a(parcel, Status.CREATOR);
                Bundle bundle2 = (Bundle) duh.a(parcel, Bundle.CREATOR);
                duh.b(parcel);
                fes.a(status3, bundle2, (bym) this.a);
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                byte[] createByteArray = parcel.createByteArray();
                duh.b(parcel);
                ((fjo) this.a).b(new fqf(createByteArray, 1));
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                duh.b(parcel);
                ((fjo) this.a).b(new fqf(createByteArray2, 0));
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                LocationSettingsResult locationSettingsResult = (LocationSettingsResult) duh.a(parcel, LocationSettingsResult.CREATOR);
                duh.b(parcel);
                fma.ba(locationSettingsResult.a, new lrs(locationSettingsResult), (bym) this.a);
                return true;
            case 6:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        fsfVar2 = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof fsf) {
                            fsfVar2 = (fsf) queryLocalInterface;
                        } else {
                            fsfVar2 = new fsf(readStrongBinder);
                        }
                    }
                    duh.b(parcel);
                    fmm fmmVar = new fmm(null);
                    parcel2.writeNoException();
                    duh.d(parcel2, fmmVar);
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        fsfVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface2 instanceof fsf) {
                            fsfVar = (fsf) queryLocalInterface2;
                        } else {
                            fsfVar = new fsf(readStrongBinder2);
                        }
                    }
                    duh.b(parcel);
                    fmm fmmVar2 = new fmm(null);
                    parcel2.writeNoException();
                    duh.d(parcel2, fmmVar2);
                }
                return true;
            case 7:
                if (i != 1) {
                    return false;
                }
                this.a.o();
                parcel2.writeNoException();
                return true;
            case 8:
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                duh.b(parcel);
                if (readInt != 3) {
                    eur eurVar = (eur) this.a;
                    eey eeyVar = eurVar.am;
                    if (eeyVar != null && ((accessibilityManager = (AccessibilityManager) eurVar.x().getSystemService("accessibility")) == null || !accessibilityManager.isEnabled())) {
                        ((ebf) eeyVar.b.a()).p(4);
                    }
                    if (readInt == 1) {
                        eurVar.al = true;
                        ((myu) eurVar.an.a).e(false);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface3 instanceof fsf) {
                        fsfVar3 = (fsf) queryLocalInterface3;
                    } else {
                        fsfVar3 = new fsf(readStrongBinder3);
                    }
                }
                duh.b(parcel);
                this.a.a(new fsa(fsfVar3));
                parcel2.writeNoException();
                return true;
            case 10:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface4 instanceof fsf) {
                        fsfVar8 = (fsf) queryLocalInterface4;
                    } else {
                        fsfVar8 = new fsf(readStrongBinder4);
                    }
                }
                duh.b(parcel);
                this.a.b(new fsa(fsfVar8));
                parcel2.writeNoException();
                return true;
            case 11:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface5 instanceof fsf) {
                        fsfVar7 = (fsf) queryLocalInterface5;
                    } else {
                        fsfVar7 = new fsf(readStrongBinder5);
                    }
                }
                duh.b(parcel);
                this.a.c(new fsa(fsfVar7));
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                        if (readStrongBinder6 != null) {
                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                            if (queryLocalInterface6 instanceof fsf) {
                                fsfVar4 = (fsf) queryLocalInterface6;
                            } else {
                                fsfVar4 = new fsf(readStrongBinder6);
                            }
                        }
                        duh.b(parcel);
                    } else {
                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                        if (readStrongBinder7 != null) {
                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                            if (queryLocalInterface7 instanceof fsf) {
                                fsfVar5 = (fsf) queryLocalInterface7;
                            } else {
                                fsfVar5 = new fsf(readStrongBinder7);
                            }
                        }
                        duh.b(parcel);
                    }
                } else {
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface8 instanceof fsf) {
                            fsfVar6 = (fsf) queryLocalInterface8;
                        } else {
                            fsfVar6 = new fsf(readStrongBinder8);
                        }
                    }
                    duh.b(parcel);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                if (i != 1) {
                    return false;
                }
                Status status4 = (Status) duh.a(parcel, Status.CREATOR);
                SyncResult syncResult = (SyncResult) duh.a(parcel, SyncResult.CREATOR);
                duh.b(parcel);
                if (status4.a()) {
                    bArr = syncResult.a;
                }
                fma.bb(status4, bArr, (bym) this.a);
                return true;
            case 14:
                if (i != 2) {
                    return false;
                }
                byte[] createByteArray3 = parcel.createByteArray();
                duh.b(parcel);
                ((fjo) this.a).b(new fqf(createByteArray3, 2));
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                Status status5 = (Status) duh.a(parcel, Status.CREATOR);
                byte[] createByteArray4 = parcel.createByteArray();
                duh.b(parcel);
                if (status5.a()) {
                    try {
                        ljn m = ljn.m(hws.d, createByteArray4, 0, createByteArray4.length, lja.a());
                        ljn.A(m);
                        fma.ba(status5, (hws) m, (bym) this.a);
                    } catch (ljy e) {
                        ((bym) this.a).r(e);
                    }
                } else {
                    fma.ba(status5, null, (bym) this.a);
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i, byte[] bArr) {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(fjo fjoVar, int i) {
        super("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
        this.b = i;
        this.a = fjoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(fjo fjoVar, int i, byte[] bArr) {
        super("com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
        this.b = i;
        this.a = fjoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i, short[] sArr) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(frj frjVar, int i) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        this.b = i;
        this.a = frjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(lbk lbkVar, int i, byte[] bArr) {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        this.b = i;
        this.a = lbkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(frh frhVar, int i) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        this.b = i;
        this.a = frhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(fri friVar, int i) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
        this.b = i;
        this.a = friVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(lbk lbkVar, int i) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        this.b = i;
        this.a = lbkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(eur eurVar, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        this.b = i;
        this.a = eurVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(frg frgVar, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
        this.b = i;
        this.a = frgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i, int[] iArr) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(bym bymVar, int i, boolean[] zArr) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fen(fjo fjoVar, int i, char[] cArr) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = i;
        this.a = fjoVar;
    }
}
