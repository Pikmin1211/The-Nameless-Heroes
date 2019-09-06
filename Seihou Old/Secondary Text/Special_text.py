'''Given a list, returns an EA installer for that list for menu options.'''

unit_menu_list=[' Seize',' Attack',' Attack',' Staff',' Ride',' Exit',
                ' Dance',' Steal',' Summon',' Capture',' Pick',
                ' Talk',' Visit',' Chest',' Door',' Armory',' Vendor',
                ' Secret',' Arena',' Rescue',' Refuge',' Drop',' Take',' Give',
                ' Support',' Item',' Trade',' Supply',' Wait']

main_menu_list=['Range','Unit','Status','Guide','Options','Retreat',
                'Suspend','End']

use_menu_list=['Use','Equip','Trade','Discard']

discard_menu_list=['Yes','No']

world_map_list1=[' Unit',' Status',' Guide',' Options', ' Save']

world_map_list2=[' Enter Armory',' Enter Shop',' Enter ? Shop',' Manage Items']

master_list=[unit_menu_list,main_menu_list]

def make_EA_installer(entries_list, offset, separation, file_name):
    '''creates an installer for the entries'''
    #example:
    #PUSH
    #ORG 0xoffset
    #POIN file_name1 file_name2... OR POIN file_name1\n ORG 0xoffset+1*separation\n POIN file_name2
    with open('{}.txt'.format(str(file_name)),'w') as f:
        label_list=[]
        f.write('PUSH\nORG {}\nPOIN'.format(hex(offset)))
        for i,entry in enumerate(entries_list):
            a=' {}'.format(file_name+str(i))
            label_list.append(a)
            f.write(a)
            if separation != 0 and i<len(entries_list)-1:
                f.write('\nORG {}\nPOIN'.format(hex(offset+((i+1)*separation))))

        f.write('\nPOP\n')

        for i,label in enumerate(label_list):
            f.write('{}:\nBYTE'.format(label.strip())) #strip is because there's a preceding space
            for letter in entries_list[i]:
                if letter == ' ': #if it's a space
                    f.write(' 0x81 0x40')
                elif letter.islower(): #if we have a lower case letter
                    #'a' is 0x82 0x81 in shift jis, 0x61 in ascii
                    f.write(' 0x82 0x{:02x}'.format(ord(letter)+32))
                elif letter.isupper(): #if we have an upper case letter
                    #'A' is 0x82 0x60 in shift jis, 0x41 in ascii
                    f.write(' 0x82 0x{:02x}'.format(ord(letter)+31))
            f.write(' 0x00\n')


make_EA_installer(main_menu_list,0x5C534C,0x24,'Main_Menu')

make_EA_installer(unit_menu_list,0x5C1038,0x24,'Unit_Menu')
    
make_EA_installer(use_menu_list,0x5C4A94,0x24,'Use_Menu')

make_EA_installer(discard_menu_list,0x5C4A28,0x24,'Discard_Menu')

make_EA_installer(world_map_list1,0xAC1A0C,0x24,'World_Map1_Menu')

make_EA_installer(world_map_list2,0xAC1B0C,0x24,'World_Map2_Menu')
