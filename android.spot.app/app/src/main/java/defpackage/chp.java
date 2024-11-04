package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chp extends Binder implements chq {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public chp() {
        attachInterface(this, b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = b;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Object obj = null;
        int i3 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.c) {
                    String str2 = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(readInt));
                    if (str2 == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                    } else {
                        int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                        while (i3 < beginBroadcast) {
                            try {
                                Object broadcastCookie = multiInstanceInvalidationService.c.getBroadcastCookie(i3);
                                broadcastCookie.getClass();
                                Integer num = (Integer) broadcastCookie;
                                int intValue = num.intValue();
                                String str3 = (String) multiInstanceInvalidationService.b.get(num);
                                if (readInt != intValue && amr.i(str2, str3)) {
                                    try {
                                        ((cho) multiInstanceInvalidationService.c.getBroadcastItem(i3)).a(createStringArray);
                                    } catch (RemoteException e) {
                                        Log.w("ROOM", "Error invoking a remote callback", e);
                                    }
                                }
                                i3++;
                            } finally {
                                multiInstanceInvalidationService.c.finishBroadcast();
                            }
                        }
                    }
                }
            } else {
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i4 = chn.a;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(chn.b);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof cho)) {
                        obj = (cho) queryLocalInterface;
                    } else {
                        obj = new chm(readStrongBinder);
                    }
                }
                int readInt2 = parcel.readInt();
                obj.getClass();
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
                synchronized (multiInstanceInvalidationService2.c) {
                    multiInstanceInvalidationService2.c.unregister(obj);
                }
                parcel2.writeNoException();
            }
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            int i5 = chn.a;
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(chn.b);
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof cho)) {
                    obj = (cho) queryLocalInterface2;
                } else {
                    obj = new chm(readStrongBinder2);
                }
            }
            String readString = parcel.readString();
            obj.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
                synchronized (multiInstanceInvalidationService3.c) {
                    int i6 = multiInstanceInvalidationService3.a + 1;
                    multiInstanceInvalidationService3.a = i6;
                    RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService3.c;
                    Integer valueOf = Integer.valueOf(i6);
                    if (remoteCallbackList.register(obj, valueOf)) {
                        multiInstanceInvalidationService3.b.put(valueOf, readString);
                        i3 = i6;
                    } else {
                        multiInstanceInvalidationService3.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }

    public chp(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
